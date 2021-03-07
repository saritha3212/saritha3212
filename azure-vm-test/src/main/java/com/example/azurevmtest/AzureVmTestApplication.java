package com.example.azurevmtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AzureVmTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureVmTestApplication.class, args);
		System.out.println("Hurray! Azure VM Deployment Successful");
	}

}
