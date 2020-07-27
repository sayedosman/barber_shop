package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.ServicesType;
import com.example.demo.Service.ServiceTypeService;

@RestController
@RequestMapping("/api/serviceType")
public class ServiceTypeController {
	@Autowired
	private ServiceTypeService serviceTypeService;
	@GetMapping("/all")
	public List<ServicesType>getServiceTypes(){
		return serviceTypeService.getAllServiceTypes();
	}
}
