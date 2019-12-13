package com.example.crudops.Controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.crudops.Model.Jobs;
import com.example.crudops.Model.Registration;
import com.example.crudops.Service.EmployerService;
import com.example.crudops.Service.JobService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class MainController {
	
	
	
	@Autowired
	EmployerService empservice;
	@Autowired
	JobService jobservice;
	
	@PostMapping("/upload")
	public ResponseEntity<String> reg(@RequestParam("company_Logo")MultipartFile company_Logo,@RequestParam("registrations")String registrations,@RequestParam("job")String job) throws JsonParseException, JsonMappingException, IOException
	{
		Registration r=new ObjectMapper().readValue(registrations,Registration.class);
		Jobs j=new ObjectMapper().readValue(job,Jobs.class);
	r.setCompany_Logo(company_Logo.getBytes());
	Set<Jobs> jo=r.getJobs();
	j.setRegistration(r);
	r.setJobs(jo);
	empservice.reg(j);
	empservice.reg(r);
	return ResponseEntity.ok("Resume uploaded successfully");
	}
	
	@GetMapping("/getallregistration")
	public List<Registration> reg()
	{
		return empservice.reg();
 
	}
	@GetMapping("/getbyparticularid/{id}")
	public Optional<Registration> fetchbyid(@PathVariable int id)
	{
		return empservice.fetchbyid(id) ;
		
	}
	
	@PutMapping("/upadteregistration/{id}")
	public Registration update(@PathVariable int id,@RequestBody Registration reg)
	{
		Optional<Registration> re=empservice.fetchbyid(id);
		Registration emp=re.get();
		emp.setCompany_Name(reg.getCompany_Name());
		emp.setContact_PersonName(reg.getContact_PersonName());
		emp.setDesignation(reg.getDesignation());
		emp.setGst_Number(reg.getGst_Number());
		emp.setTin_Number(reg.getTin_Number());
		emp.setWebsite(reg.getWebsite());
		emp.setAddress(reg.getAddress());
		emp.setCity(reg.getCity());
		emp.setState(reg.getState());
		emp.setPincode(reg.getPincode());
		emp.setCountry(reg.getCountry());
		return empservice.update(emp) ;
		
		
		
	}
	
	
	@DeleteMapping("/employer")
	public void deleteall()
	{
		empservice.deleteall();
		
	}
	@DeleteMapping("/employer/{id}")
	public void empdeletebyid(@PathVariable int id)
	{
		empservice.empdeletebyid(id);
	}
	
	//same time we will delete both parenet and child class values
	
//	@DeleteMapping("/deleteall")
//	public void deleteallemp()
//	{
//		registrationrepo.
//	}
//	
//	
	
}
