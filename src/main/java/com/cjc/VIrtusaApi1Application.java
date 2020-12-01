package com.cjc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class VIrtusaApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(VIrtusaApi1Application.class, args);
	}

}
