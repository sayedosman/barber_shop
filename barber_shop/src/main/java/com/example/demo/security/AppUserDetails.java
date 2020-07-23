package com.example.demo.security;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.demo.Model.Employee;




public class AppUserDetails implements UserDetails{

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Employee employee;
	
	
	public AppUserDetails(Employee employee) {
		this.employee = employee;
	}
	public AppUserDetails() {}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		GrantedAuthority authorty=new GrantedAuthority() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			@Override
			public String getAuthority() {
					return employee.getType().getName();
				
			}
		};
		
		
		return Arrays.asList(authorty);
	}

	@Override
	public String getPassword() {
		
		return employee.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return employee.getUsername();
	}

	

	public Employee getUser() {
		return employee;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
