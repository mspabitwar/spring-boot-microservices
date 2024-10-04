package com.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Value("${my.greeting}")
	private String greetingMessage;

	@Value("${app.description}")
	private String appDescription;

	@GetMapping("greeting")
	public String greeting() {
		StringBuilder sb = new StringBuilder();
		sb.append(greetingMessage).append("@").append(appDescription);
		System.out.print(sb.toString());
		return sb.toString();
	}
}