package com.example;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
/**
 * @author Ittipol
 *
 */
//@EnableAutoConfiguration
@SpringBootApplication
public class RestaurantApplication {
	
	// Home Page
	// http://localhost:8081/restaurant/
	
	// admin page
	// http://localhost:9000/admin/metrics
	// http://localhost:9000/admin/trace
	// http://localhost:9000/admin/env
	// http://localhost:9000/admin/beans
	// http://localhost:9000/admin/dump
	// http://localhost:9000/admin/mappings
	// ssh -p 2000 user@127.0.0.1
	// dashboard
	
	public static void main(String[] args) {
		SpringApplication.run(RestaurantApplication.class, args);
	}
	
//	 @Bean
//	    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//	        return args -> {
//
//	            System.out.println("Let's inspect the beans provided by Spring Boot:");
//	            String[] beanNames = ctx.getBeanDefinitionNames();
//	            Arrays.sort(beanNames);
//	            for (String beanName : beanNames) {
//	                System.out.println(beanName);
//	            }
//	        };
//	    }
	
}




