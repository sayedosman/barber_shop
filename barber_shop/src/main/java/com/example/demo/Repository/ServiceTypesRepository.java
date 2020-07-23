package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Model.ServicesType;

@Repository
public interface ServiceTypesRepository extends JpaRepository<ServicesType, Long>{

}
