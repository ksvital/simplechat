package com.huonix.simplechat.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.huonix.simplechat.models.ChatParticipant;

/**
 * ChatParticipant persintency repository
 * 
 * @author Kepler Vital
 *
 */
@Repository
public interface ChatParticipantRepository extends CassandraRepository<ChatParticipant, ChatParticipant> {

	/**
	 * Find all chats of user
	 * 
	 * @param userId must not be null {@literal null}
	 * @return List<ChatParticipant> the chat
	 */
	List<ChatParticipant> findAllByUserID(UUID userId);
	
}
