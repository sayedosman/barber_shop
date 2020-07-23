package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Service;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Long>{

}
