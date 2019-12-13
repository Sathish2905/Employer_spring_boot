package com.example.crudops.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.crudops.Model.Jobs;

import com.example.crudops.Service.JobService;

@RestController
public class JobController {
	@Autowired
	JobService jobservice;
	
	@GetMapping("/getalljobs")
	public List<Jobs> getalljob()
	{
		return jobservice.getalljob();
		
	}
	@GetMapping("/getparticularjob/{id}")
	public Optional<Jobs> fetchbyid(@PathVariable int id)
	{
		return jobservice.fetchbyid(id) ;
		
	}
	@PutMapping("/jobupadte/{id}")
	public Jobs update(@PathVariable int id,@RequestBody Jobs jobs)
	{
		Optional<Jobs> j=jobservice.fetchbyid(id);
		Jobs job=j.get();
		job.setJob_code(jobs.getJob_code());
		job.setScore(jobs.getScore());
		job.setCompany_Name(jobs.getCompany_Name());
		job.setJob_Role(jobs.getJob_Role());
		job.setJob_Description(jobs.getJob_Description());
		job.setEligibility_Criteria(jobs.getEligibility_Criteria());
		job.setJob_Location(jobs.getJob_Location());
		job.setExperience(jobs.getExperience());
		job.setSalary(jobs.getSalary());
		job.setJob_Type(jobs.getJob_Type());
		job.setSkills(jobs.getSkills());
		return jobservice. update(job);
		}
	@DeleteMapping("/deletealljobs")
	public void deletealljobs()
	{
		jobservice.deletealljobs();
		
	}
	@DeleteMapping("/deletebyparticularjob/{id}")
	public void deletebyid(@PathVariable int id)
	{
		jobservice.deletebyid(id);
	}

}
