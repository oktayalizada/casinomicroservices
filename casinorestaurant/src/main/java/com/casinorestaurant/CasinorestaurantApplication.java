package com.casinorestaurant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
public class CasinorestaurantApplication {

	public static void main(String[] args) {
		SpringApplication.run(CasinorestaurantApplication.class, args);
	}
}
