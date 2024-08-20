package com.BrinkerInc.BrinkerIncRestaurantListing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class BrinkerIncRestaurantListingApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(BrinkerIncRestaurantListingApplication.class, args);
		
		
	}

	
	
}
