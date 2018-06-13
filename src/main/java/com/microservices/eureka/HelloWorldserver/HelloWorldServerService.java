package com.microservices.eureka.HelloWorldserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/hello/server/")
public class HelloWorldServerService {

	@GetMapping
	public String hello() {
		return "Hello world Message coming from Hello World Server through Eureka Server";
	}
	
}
