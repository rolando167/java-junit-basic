package com.pruebas.spring.unit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UnitApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnitApplication.class, args);

		Example example = new Example();
		int result = example.sumar(4, 6);
		System.out.println(result);
	}

}
