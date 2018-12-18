package com.example.demo.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.Job;
import com.example.demo.model.JobRepo;

public class JobService {
	
	@Autowired
	private JobRepo jobRepo;
	
	public Job jobUpdate(String id, String name){
		
		Job job = jobRepo.findJobByjobId(id);
		
		job.setJobTitle(name);
		
		return job;
	}
	
	public List<Job> jobs_min_salary (BigDecimal minSalary){
		
		float min_salary = minSalary.floatValue();
		List<Job> job_list = jobRepo.findAll();
		List<Job> job_list_return = new ArrayList<Job>();
		int i = 0;
		int size  = job_list.size();
		
		while ( i < size){
			
			if ( job_list.get(i).getMinSalary().floatValue() > min_salary){
				job_list_return.add(job_list.get(i));
			}
			i++;
		}
		
		job_list_return.sort();
		
		return job_list_return;
	}
	
	

}
