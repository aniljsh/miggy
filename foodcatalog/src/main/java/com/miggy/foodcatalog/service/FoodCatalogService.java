package com.miggy.foodcatalog.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.miggy.foodcatalog.dto.FoodCatalogDTO;
import com.miggy.foodcatalog.dto.FoodItemDTO;
import com.miggy.foodcatalog.dto.RestaurantDTO;
import com.miggy.foodcatalog.entity.FoodItemEntity;
import com.miggy.foodcatalog.mapper.FoodItemMapper;
import com.miggy.foodcatalog.repo.FoodItemRepo;

@Service
public class FoodCatalogService {

	@Autowired
	private FoodItemRepo foodItemRepo;

	@Autowired
	private RestTemplate restTemplate;

	public FoodItemDTO addFoodItem(FoodItemDTO foodItemDTO) {

		foodItemRepo.save(FoodItemMapper.mapFoodItemDTOToFoodItemEntity(foodItemDTO));

		return foodItemDTO;

	}

	public FoodCatalogDTO getFoodCatalogDTO(int restaurantId) {

		RestaurantDTO restaurantDTO = getRestaurantFromMS(restaurantId);
		List<FoodItemDTO> foodItems = getFoodItemsByRestaurant(restaurantId);

		return createFoodCatalog(restaurantDTO, foodItems);

	}

	private FoodCatalogDTO createFoodCatalog(RestaurantDTO restaurantDTO, List<FoodItemDTO> foodItems) {
		FoodCatalogDTO foodCatalogDTO = new FoodCatalogDTO();
		foodCatalogDTO.setRestaurant(restaurantDTO);
		foodCatalogDTO.setFoodItems(foodItems);
		return foodCatalogDTO;
	}

	private RestaurantDTO getRestaurantFromMS(int restaurantId) {

		return restTemplate.getForObject("http://RESTAURANT-SERVICE/restaurant/find-restaurant/" + restaurantId,
				RestaurantDTO.class);
	}

	private List<FoodItemDTO> getFoodItemsByRestaurant(int restaurantId) {

		List<FoodItemEntity> foodItems = foodItemRepo.findByRestaurantId(restaurantId);

		return foodItems.stream().map(food -> FoodItemMapper.mapFoodItemEntityToFoodItemDTO(food))
				.collect(Collectors.toList());

	}

}
