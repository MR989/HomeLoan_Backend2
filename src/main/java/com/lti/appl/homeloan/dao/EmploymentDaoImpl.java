package com.lti.appl.homeloan.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Query;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.appl.homeloan.exceptions.EmploymentNotFoundException;
import com.lti.appl.homeloan.model.Employment;

@Repository
public class EmploymentDaoImpl extends BaseRepository implements EmploymentDao {
	@Transactional
	public void insertEmploymentDetail(Employment ref) {
		// TODO Auto-generated method stub
		System.out.println("insertEmploymentDetail insertion called..." + ref);
		EntityManager entityManager = getEntityManager();
		entityManager.persist(ref);
		System.out.println("insertEmploymentDetail inserted..." + ref);
	}

	@Transactional
	public List<Employment> selectAllEmploymentDetails() {
		// TODO Auto-generated method stub
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery(" from Employment");
		List<Employment> emptList = query.getResultList();
		return emptList;
	}

	@Transactional
	public Employment selectEmploymentDetail(int id) throws EmploymentNotFoundException {
		// TODO Auto-generated method stub
		EntityManager entityManager = getEntityManager();
		return entityManager.find(Employment.class, id);
	}



	@Transactional
	public void deleteEmployment(int id) throws EmploymentNotFoundException {
		// TODO Auto-generated method stub
		EntityManager entityManager = getEntityManager();
		Employment founddebtor = entityManager.find(Employment.class, id);
		if(founddebtor!=null)
			entityManager.remove(founddebtor);
		else
			throw new EmploymentNotFoundException("Employment Not Found : "+id);
		System.out.println(" Entitymanager: entity removed ... ");
	
	}

	@Transactional
	public void updateEmployment(Employment id, int a) throws EmploymentNotFoundException {
		// TODO Auto-generated method stub
		EntityManager entityManager1 = getEntityManager();
		Query query = entityManager1.createNativeQuery("UPDATE EMPLOYMENT set DEBTORID=:vDEBTORID where EMPLOYMENTID =:vEMPLOYMENTID");
        query.setParameter("vDEBTORID", a);
        query.setParameter("vEMPLOYMENTID" ,id.getEmploymentId());
        query.executeUpdate();
	}

}
