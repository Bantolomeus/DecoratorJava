package com.bantolomeus.decorator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DecoratorApplication.class, args);

		House woodHouse = new WoodHouse();

		woodHouse = new Balcony(new Balcony(new Balcony(woodHouse)));
		woodHouse = new Balcony(woodHouse);

		System.out.println("House costs: $" +  woodHouse.getCost());
	}

}
