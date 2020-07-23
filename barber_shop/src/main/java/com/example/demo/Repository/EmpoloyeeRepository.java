package com.example.demo.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Employee;

@Repository
public interface EmpoloyeeRepository extends JpaRepository<Employee, Long> {

	public Optional<Employee> findByFirstName(String firstname);
}
