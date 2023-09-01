package com.miggy.restaurantlisting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RestaurantlistingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantlistingApplication.class, args);
	}

}
