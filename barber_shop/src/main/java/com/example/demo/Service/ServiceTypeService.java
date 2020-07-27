package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.ServicesType;
import com.example.demo.Repository.ServiceRepository;
import com.example.demo.Repository.ServiceTypeRepository;

@Service
public class ServiceTypeService {
	@Autowired
	private  ServiceTypeRepository serviceTypeRepository;
	
	public List<ServicesType>getAllServiceTypes(){
		return serviceTypeRepository.findAll();
	}
	public ServicesType getServiceTypeById(Long id){
		return serviceTypeRepository.findById(id).get();
	}
   public ServicesType SaveServiceType(ServicesType servicetype) {
	   serviceTypeRepository.save(servicetype);
	   return servicetype;
	   
   }
}