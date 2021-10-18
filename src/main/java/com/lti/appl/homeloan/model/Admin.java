package com.lti.appl.homeloan.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADMIN")
public class Admin {
	@Id
	@Column(name = "ADMINUSERNAME")
	String adminUsername;
	
	@Column(name = "ADMIN_FNAME")
	String adminFirstname;
	
	@Column(name = "ADMIN_LNAME")
	String adminLastName;
	
	@Column(name = "ADMIN_PASSWORD")
	String adminPassword;

	public String getAdminUsername() {
		return adminUsername;
	}

	public void setAdminUsername(String adminUsername) {
		this.adminUsername = adminUsername;
	}

	public String getAdminFirstname() {
		return adminFirstname;
	}

	public void setAdminFirstname(String adminFirstname) {
		this.adminFirstname = adminFirstname;
	}

	public String getAdminLastName() {
		return adminLastName;
	}

	public void setAdminLastName(String adminLastName) {
		this.adminLastName = adminLastName;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public Admin(String adminUsername, String adminFirstname, String adminLastName, String adminPassword) {
		super();
		this.adminUsername = adminUsername;
		this.adminFirstname = adminFirstname;
		this.adminLastName = adminLastName;
		this.adminPassword = adminPassword;
	}

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

}
