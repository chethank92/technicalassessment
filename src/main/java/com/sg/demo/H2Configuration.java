package com.sg.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties
public class H2Configuration {

	private EntityManagerFactory entityManagerFactory;

	@Bean
	public EntityManager getEntityManagerFactory() {
		return entityManagerFactory.createEntityManager();
	}
}
