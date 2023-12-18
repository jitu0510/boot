package com.fireflink;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PropertiesConfiguration {

	@Bean
	@Primary
	public Properties getProperties() throws IOException {
		Properties properties = new Properties();
		FileInputStream fileInputStream = new FileInputStream("src/main/resources/application.properties");
		properties.load(fileInputStream);
		return properties;
	}
	
	
}
