package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Type;
import com.example.demo.Repository.TypeRepository;



@Service
public class TypeService {
	@Autowired
	private TypeRepository typeRepository;
	
	public List<Type>getAllTypes(){
		return typeRepository.findAll();
	}
	public Type getTypeById(Long id){
		return typeRepository.findById(id).get();
	}
   public Type SaveType(Type type) {
	   typeRepository.save(type);
	   return type;
	   
   }
}