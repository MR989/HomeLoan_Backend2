package com.lti.appl.homeloan.dao;

import java.util.List;

import com.lti.appl.homeloan.exceptions.PropertyNotFoundException;
import com.lti.appl.homeloan.model.Property;

public interface PropertyDao {
	void property(Property ref);

	List<Property> selectAllProperties();

	Property selectProperty(int id) throws PropertyNotFoundException;

	List<Property> selectLoanByApplication_Id(int Application_Id) throws PropertyNotFoundException;

	void updateproperty(Property id,int a) throws PropertyNotFoundException;

	void deleteproperty(int id) throws PropertyNotFoundException;

}
