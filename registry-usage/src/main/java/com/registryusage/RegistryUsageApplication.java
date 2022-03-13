package com.registryusage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RegistryUsageApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistryUsageApplication.class, args);
	}

}
