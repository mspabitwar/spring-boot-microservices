package com.spring.config;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	@Value("${my.greeting: default hello}")
	private String greetingMessage;

	@Value("${app.description}")
	private String appDescription;

	@Value("${my.list.value}")
	private List<String> listValues;

	@Value("#{${my.map.value}}")
	private Map<String, String> mapValues;

	@GetMapping("greeting")
	public String greeting() {
		StringBuilder sb = new StringBuilder();
		sb.append(greetingMessage).append("@").append(appDescription).append("@").append(listValues).append("@")
				.append(mapValues);
		return sb.toString();
	}
}