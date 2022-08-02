package com.example.demo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Service.PasswordEncoder;




@SpringBootApplication
public class LoginMicApplication{
	
	

	public static void main(String[] args) {
		SpringApplication.run(LoginMicApplication.class, args);
		System.out.println("working");
		String passString ="password";
		PasswordEncoder passwordEncoder = new PasswordEncoder();
		String passString2 = passwordEncoder.passwordEncryption(passString);
		System.out.println(passString2);
	}
	

}
