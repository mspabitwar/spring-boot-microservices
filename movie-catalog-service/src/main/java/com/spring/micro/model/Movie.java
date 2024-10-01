package com.spring.micro.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Movie {

	private String movieId;
	private String name;
}