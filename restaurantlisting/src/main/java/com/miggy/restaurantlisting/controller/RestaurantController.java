package com.miggy.restaurantlisting.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miggy.restaurantlisting.dto.RestaurantDTO;
import com.miggy.restaurantlisting.service.RestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

	@Autowired
	private RestaurantService restaurantService;

	@GetMapping("/find-restaurants")
	public ResponseEntity<List<RestaurantDTO>> findRestaurantList() {

		return new ResponseEntity(restaurantService.findRestaurantList(), HttpStatus.OK);

	}

	@PostMapping("/create-restaurant")
	public ResponseEntity<RestaurantDTO> createRestaurant(@RequestBody RestaurantDTO restaurantDTO) {

		return new ResponseEntity(restaurantService.createRestaurant(restaurantDTO), HttpStatus.CREATED);

	}

	@GetMapping("/find-restaurant/{id}")
	public ResponseEntity<RestaurantDTO> findRestaurant(@PathVariable int id) {

		RestaurantDTO restaurantDTO = restaurantService.findRestaurant(id);

		if (restaurantDTO != null) {
			return new ResponseEntity(restaurantDTO, HttpStatus.OK);

		}

		return new ResponseEntity(HttpStatus.NO_CONTENT);

	}

}
