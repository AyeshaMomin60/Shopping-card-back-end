package com.cg.cart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;



@SpringBootApplication
public class ShoppingCardApplicationNew extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		
		SpringApplication.run(ShoppingCardApplicationNew.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ShoppingCardApplicationNew.class);
	}

}
