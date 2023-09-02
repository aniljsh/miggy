package com.miggy.order.entity;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

import com.miggy.order.dto.FoodItemDto;
import com.miggy.order.dto.RestaurantDto;
import com.miggy.order.dto.UserDto;

@Document("order")
public class OrderEntity {

	private Integer orderId;
	private List<FoodItemDto> foodItems;
	private RestaurantDto restaurant;
	private UserDto userDto;

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

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

	public UserDto getUserDto() {
		return userDto;
	}

	public void setUserDto(UserDto userDto) {
		this.userDto = userDto;
	}

}
