package com.example.demo.control;

import java.util.List;

import org.aspectj.lang.annotation.RequiredTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Country;
import com.example.demo.model.CountryRepo;

@Controller
@RequestMapping("/country")
public class CountryRepoControl {
	
	@Autowired
	private CountryRepo repo;
	
	
	@RequestMapping("/all")
	public @ResponseBody List<Country> findAll(){
		return repo.findAll();
	
}
}
