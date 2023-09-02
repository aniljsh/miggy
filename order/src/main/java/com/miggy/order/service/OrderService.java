package com.miggy.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.miggy.order.dto.OrderDto;
import com.miggy.order.dto.OrderDtoFE;
import com.miggy.order.dto.UserDto;
import com.miggy.order.entity.OrderEntity;
import com.miggy.order.mapper.OrderMapper;
import com.miggy.order.repo.OrderRepo;

@Service
public class OrderService {

	@Autowired
	private OrderRepo orderRepo;

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private OrderIdGenerator orderIdGenerator;

	public OrderDto createOrder(OrderDtoFE orderDtoFE) {

		Integer newOrderID = orderIdGenerator.generateNextOrderId();
		OrderEntity orderEntity = orderRepo.save(OrderMapper.mapOrderDtoFEToOrderEntity(orderDtoFE));
		orderEntity.setUserDto(getUserDto(orderDtoFE.getUserId()));
		orderEntity.setOrderId(newOrderID);
		return OrderMapper.mapOrderEntityToOrderDto(orderEntity);

	}

	private UserDto getUserDto(Integer userId) {

		return restTemplate.getForObject("http://USER-SERVICE/user/find-user/" + userId, UserDto.class);
	}

}
