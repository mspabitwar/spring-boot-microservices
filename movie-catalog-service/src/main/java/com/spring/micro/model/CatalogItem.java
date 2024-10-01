package com.spring.micro.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CatalogItem {

	private String title;
	private String desc;
	private int rating;
}
