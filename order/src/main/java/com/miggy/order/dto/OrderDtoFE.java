package com.miggy.order.dto;

import java.util.List;

public class OrderDtoFE {

	private List<FoodItemDto> foodItems;
	private RestaurantDto restaurant;
	private Integer userId;

	public List<FoodItemDto> getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(List<FoodItemDto> foodItems) {
		this.foodItems = foodItems;
	}

	public RestaurantDto getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(RestaurantDto restaurant) {
		this.restaurant = restaurant;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
