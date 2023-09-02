package com.miggy.order.mapper;

import com.miggy.order.dto.OrderDto;
import com.miggy.order.dto.OrderDtoFE;
import com.miggy.order.entity.OrderEntity;

public class OrderMapper {

	public static OrderEntity mapOrderDtoFEToOrderEntity(OrderDtoFE orderDtoFE) {
		OrderEntity orderEntity = new OrderEntity();
		orderEntity.setFoodItems(orderDtoFE.getFoodItems());
		orderEntity.setRestaurant(orderDtoFE.getRestaurant());

		return orderEntity;

	}

	public static OrderDto mapOrderEntityToOrderDto(OrderEntity orderEntity) {
		OrderDto orderDto = new OrderDto();
		orderDto.setFoodItems(orderEntity.getFoodItems());
		orderDto.setRestaurant(orderEntity.getRestaurant());
		orderDto.setUserDto(orderEntity.getUserDto());
		orderDto.setOrderId(orderEntity.getOrderId());
		return orderDto;

	}

}
