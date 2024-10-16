package com.lcwd.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConigServerApplication.class, args);
	}

}
