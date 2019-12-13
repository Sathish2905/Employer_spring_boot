package com.example.crudops.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name="job")
public class Jobs {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="Job_Code")
	 private String job_code;
	@Column(name="Score")
	private String score;
	@Column(name="Company_Name")
	private String company_Name;
	@Column(name="Job_Role")
	private String job_Role;
	@Column(name="Job_Description")
	private String job_Description;
    @Column(name="Eligibility_Criteria")
	private String eligibility_Criteria;
    @Column(name="Job_Location")
    private  String job_Location;
    @Column(name="Experience")
    private String experience;
    @Column(name="Salary")
    private String salary;
    @Column(name="Job_Type")
    private String job_Type;
    @Column(name="Skills")
    private String skills;
    
    public Jobs() {
		
		// TODO Auto-generated constructor stub
	}
	public Jobs(String job_code, String score, String company_Name, String job_Role, String job_Description,
			String eligibility_Criteria, String job_Location, String experience, String salary, String job_Type,
			String skills, Registration registration) {
		super();
		this.job_code = job_code;
		this.score = score;
		this.company_Name = company_Name;
		this.job_Role = job_Role;
		this.job_Description = job_Description;
		this.eligibility_Criteria = eligibility_Criteria;
		this.job_Location = job_Location;
		this.experience = experience;
		this.salary = salary;
		this.job_Type = job_Type;
		this.skills = skills;
		this.registration = registration;
	}
	@ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="registration_id")
    private Registration registration;
	public Registration getRegistration() {
		return registration;
	}
	public void setRegistration(Registration registration) {
		this.registration = registration;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJob_code() {
		return job_code;
	}
	public void setJob_code(String job_code) {
		this.job_code = job_code;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	public String getCompany_Name() {
		return company_Name;
	}
	public void setCompany_Name(String company_Name) {
		this.company_Name = company_Name;
	}
	public String getJob_Role() {
		return job_Role;
	}
	public void setJob_Role(String job_Role) {
		this.job_Role = job_Role;
	}
	public String getJob_Description() {
		return job_Description;
	}
	public void setJob_Description(String job_Description) {
		this.job_Description = job_Description;
	}
	public String getEligibility_Criteria() {
		return eligibility_Criteria;
	}
	public void setEligibility_Criteria(String eligibility_Criteria) {
		this.eligibility_Criteria = eligibility_Criteria;
	}
	public String getJob_Location() {
		return job_Location;
	}
	public void setJob_Location(String job_Location) {
		this.job_Location = job_Location;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getJob_Type() {
		return job_Type;
	}
	public void setJob_Type(String job_Type) {
		this.job_Type = job_Type;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
     
}
