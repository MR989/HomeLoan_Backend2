package com.lti.appl.homeloan.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.appl.homeloan.exceptions.PropertyNotFoundException;
import com.lti.appl.homeloan.model.Property;

@Repository
public class PropertyDaoImpl extends BaseRepository implements PropertyDao {
	@Transactional
	public void property(Property ref) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public List<Property> selectAllProperties() {
		// TODO Auto-generated method stub
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery(" from Property");
		List<Property> propList = query.getResultList();
		return propList;
	}

	@Transactional
	public Property selectProperty(int id) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		EntityManager entityManager = getEntityManager();
		return entityManager.find(Property.class, id);
	}

	@Transactional
	public List<Property> selectLoanByApplication_Id(int Application_Id) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void updateproperty(Property id, int a) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		EntityManager entityManager1 = getEntityManager();
		Query query = entityManager1.createNativeQuery("UPDATE PROPERTY set DEBTORID=:vDEBTORID where PROPERTYID =:vPROPERTYID");
        query.setParameter("vDEBTORID", a);
        query.setParameter("vPROPERTYID",id.getPropertyId());
        query.executeUpdate();
	}

	@Transactional
	public void deleteproperty(int id) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		
	}

}
