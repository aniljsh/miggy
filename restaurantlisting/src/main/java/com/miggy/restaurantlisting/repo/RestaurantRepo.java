package com.miggy.restaurantlisting.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miggy.restaurantlisting.entity.RestaurantEntity;

@Repository
public interface RestaurantRepo extends JpaRepository<RestaurantEntity, Integer> {

}
