package com.proconsul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LoginDipendenteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginDipendenteServiceApplication.class, args);
	}

}
