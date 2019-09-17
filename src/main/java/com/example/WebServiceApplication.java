package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

import com.example.service.DefaultService;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
public class WebServiceApplication {

	@Autowired
	DefaultService defaultService;

	public static void main(String[] args) {
		SpringApplication.run(WebServiceApplication.class, args);
	}

	@Bean
	public ApplicationRunner applicationRunner() {
		return new ApplicationRunner() {
			@Override
			public void run(ApplicationArguments args) throws Exception {
				defaultService.upload();
			}
		};
	}

}
