package com.awsapp.ecsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcsdemoApplication {

	public static void main(String[] args) {
		System.out.print("Main applictation modified");
		SpringApplication.run(EcsdemoApplication.class, args);
		
	}

}
