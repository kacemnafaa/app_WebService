package com.example.magazin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class MagasinClientSeviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagasinClientSeviceApplication.class, args);
	}

}
