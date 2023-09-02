package com.miggy.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miggy.order.dto.OrderDto;
import com.miggy.order.dto.OrderDtoFE;
import com.miggy.order.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService orderService;

	@PostMapping("/create-order")
	public ResponseEntity<OrderDto> createOrder(@RequestBody OrderDtoFE orderDtoFE) {
		OrderDto orderDto = orderService.createOrder(orderDtoFE);

		return new ResponseEntity<>(orderDto, HttpStatus.CREATED);

	}

}
