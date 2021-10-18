package com.lti.appl.homeloan.service;

import java.util.List;

import com.lti.appl.homeloan.exceptions.AdminNotFoundException;
import com.lti.appl.homeloan.model.Admin;

public interface AdminService {
	List<Admin> selectAllAdmins();
	List<Admin> selectAdminByUsername(String adminUsername, String adminPassword) throws AdminNotFoundException;

}
