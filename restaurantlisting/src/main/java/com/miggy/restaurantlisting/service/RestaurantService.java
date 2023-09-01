package com.miggy.restaurantlisting.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miggy.restaurantlisting.dto.RestaurantDTO;
import com.miggy.restaurantlisting.entity.RestaurantEntity;
import com.miggy.restaurantlisting.mapper.RestaurantMapper;
import com.miggy.restaurantlisting.repo.RestaurantRepo;

@Service
public class RestaurantService {

	@Autowired
	private RestaurantRepo restaurantRepo;

	public List<RestaurantDTO> findRestaurantList() {

		List<RestaurantEntity> restaurantEntities = restaurantRepo.findAll();

		List<RestaurantDTO> list = restaurantEntities.stream()
				.map(restaurantEntity -> RestaurantMapper.INSTANSE.mapRestaurantEntityToRestaurantDTO(restaurantEntity))
				.collect(Collectors.toList());

		return list;

	}

	public RestaurantDTO createRestaurant(RestaurantDTO restaurantDTO) {

		RestaurantEntity restaurantEntity = RestaurantMapper.INSTANSE.mapRestaurantDTOToRestaurantEntity(restaurantDTO);
		restaurantRepo.save(restaurantEntity);
		return RestaurantMapper.INSTANSE.mapRestaurantEntityToRestaurantDTO(restaurantEntity);

	}

	public RestaurantDTO findRestaurant(int id) {
		Optional<RestaurantEntity> restaurantEntityOptional = restaurantRepo.findById(id);

		if (restaurantEntityOptional.isPresent()) {
			return RestaurantMapper.INSTANSE.mapRestaurantEntityToRestaurantDTO(restaurantEntityOptional.get());
		}

		return null;

	}

}
