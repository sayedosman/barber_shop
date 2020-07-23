package com.example.demo.security;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import com.example.demo.Model.Employee;
import com.example.demo.Service.EmployeeService;
@Service
public class AppUserDetailServise implements UserDetailsService{
   @Autowired
	private EmployeeService employeeService;
	@Override
	public UserDetails loadUserByUsername(String firstname) throws UsernameNotFoundException {
		Employee employee= employeeService.getEmpoloyeeByname(firstname);
		return new AppUserDetails(employee);
	}

}
