package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Employee;
import com.example.demo.Repository.EmpoloyeeRepository;
import com.example.demo.security.AppUserDetails;

@Service
public class EmployeeService {
 @Autowired
 private EmpoloyeeRepository empoloyeeRepository;
 public Employee getEmpoloyeeByname(String firstname) {
	 return empoloyeeRepository.findByFirstName(firstname).get();
 }
 public AppUserDetails getEmployee(String firstname)
	{  	
   	  Optional<Employee>employee= empoloyeeRepository.findByFirstName(firstname);
   	  return employee.map(AppUserDetails::new).get();
   }
 public Employee save(Employee employee) {
	 empoloyeeRepository.save(employee);
	 return employee;
 }
}
