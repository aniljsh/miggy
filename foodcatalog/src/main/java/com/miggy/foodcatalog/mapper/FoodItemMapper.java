package com.miggy.foodcatalog.mapper;

import com.miggy.foodcatalog.dto.FoodItemDTO;
import com.miggy.foodcatalog.entity.FoodItemEntity;

public class FoodItemMapper {

	public static FoodItemEntity mapFoodItemDTOToFoodItemEntity(FoodItemDTO dto) {

		FoodItemEntity foodItemEntity = new FoodItemEntity();
		foodItemEntity.setName(dto.getName());
		foodItemEntity.setQuantity(dto.getQuantity());
		foodItemEntity.setDescription(dto.getDescription());
		foodItemEntity.setPrice(dto.getPrice());
		foodItemEntity.setRestaurantId(dto.getRestaurantId());

		return foodItemEntity;

	}

	public static FoodItemDTO mapFoodItemEntityToFoodItemDTO(FoodItemEntity entity) {

		FoodItemDTO foodItemDTO = new FoodItemDTO();
		foodItemDTO.setId(entity.getId());
		foodItemDTO.setName(entity.getName());
		foodItemDTO.setQuantity(entity.getQuantity());
		foodItemDTO.setDescription(entity.getDescription());
		foodItemDTO.setPrice(entity.getPrice());
		foodItemDTO.setRestaurantId(entity.getRestaurantId());

		return foodItemDTO;

	}

}
