package com.racetrack.Racetrack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class RacetrackApplication {

	public static void main(String[] args) {
		SpringApplication.run(RacetrackApplication.class, args);
	}
	
	/*
	 * @SuppressWarnings("deprecation")
	 * 
	 * @Bean public WebMvcConfigurer corsConfigurer() { return new
	 * WebMvcConfigurerAdapter() {
	 * 
	 * @Override public void addCorsMappings(CorsRegistry registry) {
	 * registry.addMapping("/**").allowedMethods("GET", "POST", "PUT",
	 * "DELETE").allowedOrigins("*") .allowedHeaders("*"); } }; }
	 */

}
