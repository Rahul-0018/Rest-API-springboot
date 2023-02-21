package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

public class Welcome {
	@RestController
	public class ExampleController {
		
		@GetMapping("hello")
		public String hello() {
			return "hello world";
		}
	}
}
