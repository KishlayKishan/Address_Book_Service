package com.bridgelabz.addressbook;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
@Slf4j
public class AddressBookApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Addressbook App");
		ApplicationContext context = SpringApplication.run(AddressBookApplication.class, args);
		log.info("Addressbook App Started in {} Environment",context.getEnvironment().getProperty("environment"));
		log.info("Addressbook App started");
	}

}
