package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;*/
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Employee;
import com.example.demo.Model.Order;
import com.example.demo.Repository.EmpoloyeeRepository;
import com.example.demo.Repository.OrderRepository;
import com.example.demo.Service.EmployeeService;
/*import com.example.demo.security.AppUserDetails;
import com.example.demo.security.JWTResponse;
import com.example.demo.security.TokenUtiles;*/
@RestController
@RequestMapping("/api/auth")
public class AdminController {
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private EmpoloyeeRepository employeeRepository;
	/*  @Autowired
	    private TokenUtiles tokenUtiles;
	  @Autowired 
	  private EmployeeService employeeService;
  @Autowired
  private PasswordEncoder passwordEncoder;
	@Autowired
	private AuthenticationManager authenticationManager;
	
  @PostMapping("/login")
  @CrossOrigin(origins = "*", allowedHeaders = "*")
  public JWTResponse signup(@RequestParam("username")String username, @RequestParam("password")String password)  {
  	System.out.println(username);
  	System.out.println(password);
  try {
  	    	Authentication authenticate = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username,
  	    			password));
  	    	System.out.println("1");
  	    	AppUserDetails employee=employeeService.getEmployee(username);
  	    	System.out.println("2");
  	        String authenticationToken = tokenUtiles.generateToken(employee);
  	        System.out.println("3");
  	        System.out.println(authenticationToken);
  	        return new JWTResponse(authenticationToken, username);
  }
  catch(Exception e) {
	  return null;
  }
  	    
  	
  			


  	   }

  @PostMapping("/signup")
  @CrossOrigin(origins = "*", allowedHeaders = "*")
  public Employee signup(@RequestBody Employee employee) {

	  employeeService.save(employee);
  	 return employee;
  	
     
  }*/
 @GetMapping("/order")
 public List<Employee> get() {
	 return employeeRepository.findAll();
 }

}
