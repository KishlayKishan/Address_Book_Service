package com.bridgelabz.addressbookapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AddressBookAppApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Addressbook App");
		SpringApplication.run(AddressBookAppApplication.class, args);
	}

}