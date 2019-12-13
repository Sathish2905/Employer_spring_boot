package com.example.crudops.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.crudops.Model.Jobs;
import com.example.crudops.Repository.JobsRepository;

@Service
public class JobService {
	@Autowired
	JobsRepository jobrepo;

	public List<Jobs> getalljob() {
		// TODO Auto-generated method stub
		return jobrepo.findAll() ;
	}

	public Optional<Jobs> fetchbyid(int id) {
		// TODO Auto-generated method stub
		return jobrepo.findById(id) ;
	}

	public Jobs update(Jobs job) {
		// TODO Auto-generated method stub
		return jobrepo.save(job) ;
	}

	public void deletealljobs() {
		// TODO Auto-generated method stub
		jobrepo.deleteAll();
		
	}

	public void deletebyid(int id) {
		// TODO Auto-generated method stub
		jobrepo.deleteById(id);
	}


}
