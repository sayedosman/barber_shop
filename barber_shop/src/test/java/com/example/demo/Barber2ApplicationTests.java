package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Model.Employee;
import com.example.demo.Model.Order;
import com.example.demo.Model.Service;
import com.example.demo.Model.Type;
import com.example.demo.Repository.EmpoloyeeRepository;
import com.example.demo.Repository.ServiceRepository;
import com.example.demo.Repository.TypeRepository;


@SpringBootTest
class Barber2ApplicationTests {
 @Autowired
 private TypeRepository typeRepository;
 @Autowired
 private EmpoloyeeRepository empoloyeeRepository;
 
 @Autowired
 private ServiceRepository serviceRepository;
	@Test
	void contextLoads() {
		/*Employee e=new Employee();
		e.setAddress("assuit");
		e.setGender("male");
		e.setLastName("osman");
		e.setFirstName("ahmed");
		e.setUsername("ahmed@gmail.com");
		e.setType(new Type(1,"employee"));
		e.setPhone("1235984");
		e.setPassword("jhfkjfdjkjkfhh");
		List<Order>orders=new ArrayList<Order>();
		e.setOrders(orders);
		empoloyeeRepository.save(e);*/
		Service s=new Service();
		s.setDesc("fdhvdhjfjh");
		s.setName("jkfdhjfh");
		s.setPicture("hjfdhjhj");
		serviceRepository.save(s);
		/*Type t=new Type();
		t.setName("klfdlkf");*/
				
	}
	

}
