package com.example.producto.catalogo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SprintbootServicioCatalogoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintbootServicioCatalogoApplication.class, args);
	}

}
