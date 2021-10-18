package com.lti.appl.homeloan.dao;

import javax.persistence.EntityManager;



import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository
public class BasicRepositoryImpl extends BaseRepository{
	public EntityManager getEntityManager(){
		EntityManager entityManager = super.getEntityManager();
		return entityManager;
		}
		
		@Transactional
		public void saveRecord(Object o) {
			getEntityManager().persist(o);
		}
}
