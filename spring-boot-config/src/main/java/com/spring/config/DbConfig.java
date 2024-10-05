package com.spring.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Configuration
@ConfigurationProperties("db")
@Data
public class DbConfig {
	private String connection;
	private String username;
	private String password;
}