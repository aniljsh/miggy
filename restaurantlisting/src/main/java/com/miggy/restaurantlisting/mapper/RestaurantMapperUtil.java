package com.miggy.restaurantlisting.mapper;

import com.miggy.restaurantlisting.dto.RestaurantDTO;
import com.miggy.restaurantlisting.entity.RestaurantEntity;

public class RestaurantMapperUtil {

	public static RestaurantDTO mapRestaurantEntityToRestaurantDTO(RestaurantEntity restaurantEntity) {

		RestaurantDTO restaurantDTO = new RestaurantDTO();
		restaurantDTO.setId(restaurantEntity.getId());
		restaurantDTO.setName(restaurantEntity.getName());
		restaurantDTO.setAddress(restaurantEntity.getAddress());
		restaurantDTO.setCity(restaurantEntity.getCity());
		restaurantDTO.setRestaurantDescription(restaurantEntity.getRestaurantDescription());

		return restaurantDTO;

	}

	public static RestaurantEntity mapRestaurantDTOToRestaurantEntity(RestaurantDTO restaurantDTO) {

		RestaurantEntity restaurantEntity = new RestaurantEntity();

		restaurantEntity.setName(restaurantDTO.getName());
		restaurantEntity.setAddress(restaurantDTO.getAddress());
		restaurantEntity.setCity(restaurantDTO.getCity());
		restaurantEntity.setRestaurantDescription(restaurantDTO.getRestaurantDescription());

		return restaurantEntity;

	}

}
