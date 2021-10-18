package com.lti.appl.homeloan.dao;

import java.util.List;

import com.lti.appl.homeloan.exceptions.AdminNotFoundException;
import com.lti.appl.homeloan.model.Admin;

public interface AdminDao {
	List<Admin> selectAllAdmins() ;
	List<Admin> selectAdminByUsername(String adminUsername, String adminPassword) throws AdminNotFoundException;

}
