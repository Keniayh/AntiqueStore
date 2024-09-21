package com.antiquestore.app_antique;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class AppAntiqueApplication {

	public static void main(String[] args) {
		//SpringApplication.run(AppAntiqueApplication.class, args);
		SpringApplication app = new SpringApplication(
			AppAntiqueApplication.class
		);
		app.setDefaultProperties(Collections.singletonMap("server.port", "3703"));
		app.run(args);
	}
	@Bean
	WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@SuppressWarnings("null")
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("http://localhost:4200","https://localhost",
				"https://localhost:8080").allowedMethods("*").allowedHeaders("*");
			}
		};
	}
}
