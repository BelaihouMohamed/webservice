package com.example.demo.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepo extends CrudRepository<Job, String>{
	public List<Job> findAll();
	public Job findJobByjobId(String jobId);
	//public Job getjob(String id);	
}
