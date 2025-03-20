package com.crconsult.meteorology.by.zip.code;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@EnableFeignClients
@SpringBootApplication
@EnableFeignClients
public class MeteorologyByZipCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeteorologyByZipCodeApplication.class, args);
	}

}
