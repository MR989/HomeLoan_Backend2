package com.lti.appl.homeloan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.appl.homeloan.dao.AdminRepositoryImpl;
import com.lti.appl.homeloan.exceptions.AdminNotFoundException;
import com.lti.appl.homeloan.model.Admin;

@Service
public class AdminServiceImpl  implements AdminService {
	@Autowired
	AdminRepositoryImpl adminRepo;

	@Override
	public List<Admin> selectAllAdmins() {
		System.out.println("AdminServiceImpl: Layer 4 ");
		return adminRepo.selectAllAdmins();
	}

	@Override
	public List<Admin> selectAdminByUsername(String adminUsername, String adminPassword) throws AdminNotFoundException {
		System.out.println("AdminServiceImpl: Layer 4 ");
		return adminRepo.selectAdminByUsername(adminUsername,adminPassword);
	}

}
