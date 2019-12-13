package com.example.crudops.Model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name="regis")
public class Registration {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="Company_Name")
	private String company_Name;
	@Column(name="Contact_PersonName")
	private String contact_PersonName;
	@Column(name="Designation")
	private String designation;
	@Column(name="Gst_Number")
	private String gst_Number;
	@Column(name="Tin_Number")
	private String tin_Number;
	@Column(name="Website")
	private String website;
    @Column(name="Address")
	private String address;
	@Column(name="City")
	private String city;
	@Column(name="state")
	private String state;
	@Column(name="Pincode")
	private String pincode;
	@Column(name="Country")
	private String country;
	
	@OneToMany(cascade=CascadeType.ALL)
	private Set<Jobs> jobs;
	public int getId() {
		return id;
	}
	public Set<Jobs> getJobs() {
		return jobs;
	}
	public void setJobs(Set<Jobs> jobs) {
		this.jobs = jobs;
	}
	public Registration() {
		
		// TODO Auto-generated constructor stub
	}
	public Registration(String company_Name, String contact_PersonName, String designation, String gst_Number,
			String tin_Number, String website, String address, String city, String state, String pincode,
			String country, Set<Jobs> jobs, byte[] company_Logo) {
		super();
		this.company_Name = company_Name;
		this.contact_PersonName = contact_PersonName;
		this.designation = designation;
		this.gst_Number = gst_Number;
		this.tin_Number = tin_Number;
		this.website = website;
		this.address = address;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.country = country;
		this.jobs = jobs;
		Company_Logo = company_Logo;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany_Name() {
		return company_Name;
	}
	public void setCompany_Name(String company_Name) {
		this.company_Name = company_Name;
	}
	public String getContact_PersonName() {
		return contact_PersonName;
	}
	public void setContact_PersonName(String contact_PersonName) {
		this.contact_PersonName = contact_PersonName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getGst_Number() {
		return gst_Number;
	}
	public void setGst_Number(String gst_Number) {
		this.gst_Number = gst_Number;
	}
	public String getTin_Number() {
		return tin_Number;
	}
	public void setTin_Number(String tin_Number) {
		this.tin_Number = tin_Number;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public byte[] getCompany_Logo() {
		return Company_Logo;
	}
	public void setCompany_Logo(byte[] company_Logo) {
		Company_Logo = company_Logo;
	}
	@Lob
	private byte[] Company_Logo;
}
