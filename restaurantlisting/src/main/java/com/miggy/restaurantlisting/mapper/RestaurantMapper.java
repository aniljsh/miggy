package com.miggy.restaurantlisting.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.miggy.restaurantlisting.dto.RestaurantDTO;
import com.miggy.restaurantlisting.entity.RestaurantEntity;

@Mapper
public interface RestaurantMapper {
	
	RestaurantMapper INSTANSE = Mappers.getMapper(RestaurantMapper.class);
	
	RestaurantDTO mapRestaurantEntityToRestaurantDTO(RestaurantEntity restaurantEntity);
	
	RestaurantEntity mapRestaurantDTOToRestaurantEntity(RestaurantDTO restaurantDTO);

}
