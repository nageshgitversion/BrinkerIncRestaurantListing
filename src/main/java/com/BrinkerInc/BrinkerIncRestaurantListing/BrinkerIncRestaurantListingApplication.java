package com.BrinkerInc.BrinkerIncRestaurantListing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BrinkerIncRestaurantListingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BrinkerIncRestaurantListingApplication.class, args);
	}

}
