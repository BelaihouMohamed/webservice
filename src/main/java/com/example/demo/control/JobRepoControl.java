package com.example.demo.control;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.aspectj.lang.annotation.RequiredTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.Job;
import com.example.demo.model.JobRepo;
import com.example.demo.service.JobService;
//import com.example.demo.service.Jobservice;

@Controller
@RequestMapping("/job")
public class JobRepoControl {
	
	private JobService jobService;
	
	
	@RequestMapping(value="/{id}/{name}")
	public void UpdateJobs(@PathVariable String id, @PathVariable String name){
		jobService.jobUpdate(id, name);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@RequestMapping("/all")
	public @ResponseBody List<Job> findAll(){
		return .findAll();
	
	}*/
	
	
	/*@RequestMapping(value="/all/{id}")
	public Optional<Job> getbyid(@PathVariable String id){
		return repoj.findById(id);
	}
	/*
	@RequestMapping(value="/all/{id}")
	public void UpdateJobs(@RequestBody Job jobs, @PathVariable String id){
		jserv.UpdateJobs(id, jobs);
	}*/
	
}
