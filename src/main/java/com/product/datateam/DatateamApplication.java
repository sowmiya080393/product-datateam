package com.product.datateam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.product.datateam.controller.DataController;

@SpringBootApplication
//@ComponentScan(basePackageClasses = DataController.class)
@ComponentScan(basePackages="com.product.datateam")
public class DatateamApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatateamApplication.class, args);
	}

}
