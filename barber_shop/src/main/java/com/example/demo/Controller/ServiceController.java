package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.ServicesType;
import com.example.demo.Service.ServiceService;
import com.example.demo.Service.ServiceTypeService;

@RestController
@RequestMapping("/api/service")
public class ServiceController {

	@Autowired
	private ServiceService serviceService;
	@Autowired
	private ServiceTypeService serviceTypeService;
	@GetMapping("/all")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public List<com.example.demo.Model.Service>getServices(){
		System.out.println("services");
		return serviceService.getAllServices();
	}
	@GetMapping("/all2")
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	public List<ServicesType>getServices2(){
		System.out.println("services2");
		return serviceTypeService.getAllServiceTypes();
	}
}
