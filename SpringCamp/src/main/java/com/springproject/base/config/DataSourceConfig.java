package com.springproject.base.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
	
	@ConfigurationProperties(prefix = "spring.datasource")
	// application.properties 간소화 작업
	
	// spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
	// spring.datasource.url=jdbc:mysql://localhost:3306/camping?serverTimezone=Asia/Seoul&autoReconnect=true&useSSL=false
	// spring.datasource.username=root
	// spring.datasource.password=qwer1234
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}
}


