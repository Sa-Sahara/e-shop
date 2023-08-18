package com.edu.product_mcrs;

import io.mongock.runner.springboot.EnableMongock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableMongock
public class ProductMcrsApp {

	public static void main(String[] args) {
		SpringApplication.run(ProductMcrsApp.class, args);
	}

}
