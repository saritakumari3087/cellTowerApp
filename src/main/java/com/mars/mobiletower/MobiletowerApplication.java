package com.mars.mobiletower;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MobiletowerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobiletowerApplication.class, args);
	}

}
