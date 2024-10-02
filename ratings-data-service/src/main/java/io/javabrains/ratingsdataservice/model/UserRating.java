package io.javabrains.ratingsdataservice.model;

import java.util.Arrays;
import java.util.List;
import com.spring.micro.model.Rating;

import lombok.Data;

@Data
public class UserRating {

	private String userId;
	private List<Rating> ratings;

	public void initData(String userId) {
		this.setUserId(userId);
		this.setRatings(Arrays.asList(new Rating("1234", 4), new Rating("5678", 3)));
	}
}