package com.joy.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.joy.demo.domain.mongo.joy.JoyTO;
import com.joy.demo.svc.BoardSvcImpl;

@SpringBootApplication
@RestController
public class JoyApplication {

	@Autowired
	BoardSvcImpl boardsvc;
	
	public static void main(String[] args) {
		System.out.println("###?");
		SpringApplication.run(JoyApplication.class, args);
		
	}
//
//	@GetMapping("/hello")
//	public String main(@RequestParam(value="name" , defaultValue = "World") String name ) {
//		
//		JoyTO joy = new JoyTO();
//		boardsvc.insertEvent(joy);
//		return String.format("Hello %s!", name);
//	}
	
	
}
