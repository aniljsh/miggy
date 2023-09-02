package com.miggy.foodcatalog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miggy.foodcatalog.dto.FoodCatalogDTO;
import com.miggy.foodcatalog.dto.FoodItemDTO;
import com.miggy.foodcatalog.service.FoodCatalogService;

@RestController
@RequestMapping("/food-catalog")
public class FoodCatalogController {

	@Autowired
	private FoodCatalogService foodCatalogService;

	@PostMapping("/add-food-item")
	public ResponseEntity<FoodItemDTO> addFoodItem(@RequestBody FoodItemDTO foodItemDTO) {

		foodCatalogService.addFoodItem(foodItemDTO);

		return new ResponseEntity<>(foodItemDTO, HttpStatus.CREATED);

	}

	@GetMapping("/get-food-items/{restaurantId}")
	public ResponseEntity<FoodCatalogDTO> getItemsByRestaurant(@PathVariable int restaurantId) {

		System.out.println(" restaurantId :::: "+restaurantId);
		FoodCatalogDTO foodCatalogDTO = foodCatalogService.getFoodCatalogDTO(restaurantId);

		return new ResponseEntity<>(foodCatalogDTO, HttpStatus.OK);

	}

}
