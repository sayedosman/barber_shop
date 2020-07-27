package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.ServiceRepository;


@Service
public class ServiceService {
	@Autowired
	private ServiceRepository ServiceRepository;
	
	public List<com.example.demo.Model.Service>getAllServices(){
		return ServiceRepository.findAll();
	}
	public com.example.demo.Model.Service getServiceById(Long id){
		return ServiceRepository.findById(id).get();
	}
   public com.example.demo.Model.Service SaveService(com.example.demo.Model.Service service) {
	   ServiceRepository.save(service);
	   return service;
	   
   }
}
