package com.supermarket.service;

import java.util.List;
import java.util.Map;

import com.supermarket.entity.Order;

public interface OrderService {

	public Order getTodayMaxNumber();

	public List<Order> findAll(Map<String, Object> map);

	public Long count(Map<String, Object> map);
	
	public Integer add(Order order);

}
