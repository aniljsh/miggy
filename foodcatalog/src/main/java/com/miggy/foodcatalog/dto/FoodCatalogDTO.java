package com.miggy.foodcatalog.dto;

import java.util.List;

import lombok.Data;

@Data
public class FoodCatalogDTO {

	private List<FoodItemDTO> foodItems;

	private RestaurantDTO restaurant;

	public List<FoodItemDTO> getFoodItems() {
		return foodItems;
	}

	public void setFoodItems(List<FoodItemDTO> foodItems) {
		this.foodItems = foodItems;
	}

	public RestaurantDTO getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(RestaurantDTO restaurant) {
		this.restaurant = restaurant;
	}
	
	
	

}
