package com.miggy.order.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.miggy.order.entity.OrderEntity;

@Repository
public interface OrderRepo extends MongoRepository<OrderEntity, Integer> {

}
