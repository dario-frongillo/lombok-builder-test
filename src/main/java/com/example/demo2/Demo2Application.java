package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {

	/*  NOTA BENE::
		INSTALLARE PLUGIN DI INTELLIJ Lombok Plugin
	 */

	public static void main(String[] args) {
		Animal a= Animal.newBuilder().race("ss").weigth(10).male(true).build();
		PersonExt pp = PersonExt.newBuilder().age(11).custom("cc").name("dd").build();
		SpringApplication.run(Demo2Application.class, args);
	}
}
