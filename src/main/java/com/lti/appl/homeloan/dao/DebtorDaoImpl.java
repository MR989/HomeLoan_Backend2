package com.lti.appl.homeloan.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.appl.homeloan.exceptions.DebtorNotFoundException;
import com.lti.appl.homeloan.model.Debtor;

@Repository
public class DebtorDaoImpl extends BaseRepository implements DebtorDao {
	@Transactional
	public void insertDebtor(Debtor ref) {
		// TODO Auto-generated method stub
		System.out.println("Debtor insertion called..." + ref);
		EntityManager entityManager = getEntityManager();
		entityManager.persist(ref);
		System.out.println("Debtor inserted..." + ref);
	}

	@Transactional
	public List<Debtor> selectAllDebtors() {
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery(" from Debtor");
		List<Debtor> debList= query.getResultList();
		return debList;
	}

	@Transactional
	public Debtor selectDebtorByDebtorId(int debtorId) throws DebtorNotFoundException {
		EntityManager entityManager = getEntityManager();
		return entityManager.find(Debtor.class, debtorId);//based on PK
	}

	@Transactional
	public Debtor selectDebtor(int id) throws DebtorNotFoundException {
		// TODO Auto-generated method stub
		EntityManager entityManager = getEntityManager();
		return entityManager.find(Debtor.class, id);
	}

	@Transactional
	public void updateDebtor(Debtor id) throws DebtorNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDebtor(int id) throws DebtorNotFoundException {
		// TODO Auto-generated method stub
		EntityManager entityManager = getEntityManager();
		Debtor founddebtor = entityManager.find(Debtor.class, id);
			if(founddebtor!=null)
				entityManager.remove(founddebtor);
			else
				throw new DebtorNotFoundException("Debtor Not Found : "+id);
			System.out.println(" Entitymanager: entity removed ... ");
		
	}
	
	@Transactional
	public List<Debtor> selectDebtorByDebtorId(int id, String pass) throws DebtorNotFoundException {
		// TODO Auto-generated method stub
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("select e from Debtor e where e.debtorId = :vDEBTORID and e.debtorPassword=:vDEBTORPASSWORD");
		query.setParameter("vDEBTORID", id);
		query.setParameter("vDEBTORPASSWORD", pass);
		List<Debtor> incListAsPerJob = query.getResultList();
		System.out.println("leng : " + incListAsPerJob.size());
		return incListAsPerJob;
	}
	
	@Transactional
	public List<Debtor> selectDebtorByEmail(String email, String pass) throws DebtorNotFoundException {
		// TODO Auto-generated method stub
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("select e from Debtor e where e.debtorEmail = :vDEBTOREMAIL and e.debtorPassword=:vDEBTORPASSWORD");
		query.setParameter("vDEBTOREMAIL", email);
		query.setParameter("vDEBTORPASSWORD", pass);
		List<Debtor> debtor = query.getResultList();
		System.out.println("leng : " + debtor.size());
		return debtor;
	}
	

}
