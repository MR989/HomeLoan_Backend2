package com.lti.appl.homeloan.dao;

import java.util.List;



import javax.persistence.EntityManager;
import javax.persistence.Query;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.appl.homeloan.exceptions.AdminNotFoundException;
import com.lti.appl.homeloan.model.Admin;


@Repository
public class AdminRepositoryImpl  extends BaseRepository implements AdminDao {
	public AdminRepositoryImpl() {
		System.out.println("AdminRepositoryImplementation() constructed...");
	}
	
	@Transactional
	public List<Admin> selectAllAdmins() {
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery(" from Admin");
		List<Admin> adminList= query.getResultList();
		return adminList;
	}

	@Transactional
	public List<Admin> selectAdminByUsername(String adminUsername, String adminPassword) throws AdminNotFoundException {
		System.out.println("Admin by username......");
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("SELECT ad from Admin ad WHERE ad.adminUsername=:adminUsername and ad.adminPassword=:adminPassword");
		query.setParameter("adminUsername", adminUsername);
		query.setParameter("adminPassword", adminPassword);
		List<Admin> adminList = query.getResultList();	
		return adminList;
	}

}
