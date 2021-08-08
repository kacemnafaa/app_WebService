package com.example.magazin;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@Configurable
@EnableAutoConfiguration
@EnableDiscoveryClient
@SpringBootApplication
public class MagasinAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(MagasinAdminApplication.class, args);
	}

}
