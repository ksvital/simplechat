package com.huonix.simplechat.helpers;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import com.huonix.simplechat.configs.CassandraTestExecutionListener;
import com.huonix.simplechat.configs.EmbeddedCassandraConfig;
import com.huonix.simplechat.configs.EmbeddedRabbitConfig;
import com.huonix.simplechat.configs.EmbeddedRedisConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {
		EmbeddedCassandraConfig.class, 
		EmbeddedRedisConfig.class,
		EmbeddedRabbitConfig.class
}, initializers = ConfigFileApplicationContextInitializer.class)
@TestExecutionListeners({ 
	CassandraTestExecutionListener.class,
	DependencyInjectionTestExecutionListener.class 
})
@SpringBootTest
@ActiveProfiles(profiles = {"test"})
public class ApplicationFirstStartupTest {
	
	@Autowired
	private ApplicationFirstStartup applicationFirstStartup;
	
	@Test
    public void testInit() {
		applicationFirstStartup.init();
		assertTrue(true);
    }

}
