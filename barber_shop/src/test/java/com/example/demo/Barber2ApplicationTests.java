package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.Model.Type;
import com.example.demo.Repository.TypeRepository;


@SpringBootTest
class Barber2ApplicationTests {
 @Autowired
 private TypeRepository typeRepository;
	@Test
	void contextLoads() {
		Type t=new Type();
		t.setName("admin");
		typeRepository.save(t);
	}
	

}
