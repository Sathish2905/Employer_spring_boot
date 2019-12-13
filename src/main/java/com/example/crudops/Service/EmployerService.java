package com.example.crudops.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crudops.Model.Jobs;
import com.example.crudops.Model.Registration;
import com.example.crudops.Repository.JobsRepository;
import com.example.crudops.Repository.RegistrationRepository;

@Service
public class EmployerService {
	@Autowired
	RegistrationRepository registrationrepo;
	@Autowired
	JobsRepository jobsrepo;
	public Jobs reg(Jobs j) {
		return jobsrepo.save(j) ;
		}
	public Registration reg(Registration r) {
		return registrationrepo.save(r) ;
		
		
	}
	public List<Registration> reg() {
		// TODO Auto-generated method stub
		return registrationrepo.findAll() ;
	}
	public Optional<Registration> fetchbyid(int id) {
		// TODO Auto-generated method stub
		return registrationrepo.findById(id) ;
	}
	public Registration update(Registration emp) {
		// TODO Auto-generated method stub
		return registrationrepo.save(emp) ;
	}
	public void deleteall() {
		// TODO Auto-generated method stub
		registrationrepo.deleteAll();
	}
	public void empdeletebyid(int id) {
		// TODO Auto-generated method stub
		registrationrepo.deleteById(id);
	}
	public Registration save(Registration registration) {
		// TODO Auto-generated method stub
		return registrationrepo.save(registration) ;
	}
	
	

}
