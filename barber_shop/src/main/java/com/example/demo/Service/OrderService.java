package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Order;
import com.example.demo.Repository.OrderRepository;




@Service
public class OrderService {
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order>getAllOrders(){
		return orderRepository.findAll();
	}
	public Order getOrderById(Long id){
		return orderRepository.findById(id).get();
	}
   public Order SaveOrder(Order order) {
	   orderRepository.save(order);
	   return order;
	   
   }
}
