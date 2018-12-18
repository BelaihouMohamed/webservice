package com.example.demo.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepo extends CrudRepository<Country, String>{
	public List<Country> findAll();
		
	
}
