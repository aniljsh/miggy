package com.miggy.foodcatalog.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miggy.foodcatalog.entity.FoodItemEntity;

@Repository
public interface FoodItemRepo extends JpaRepository<FoodItemEntity, Integer> {

	List<FoodItemEntity> findByRestaurantId(int restaurantId);
}
