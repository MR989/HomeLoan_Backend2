package com.lti.appl.homeloan.service;

import java.util.List;

import com.lti.appl.homeloan.exceptions.PropertyNotFoundException;
import com.lti.appl.homeloan.model.Loan;
import com.lti.appl.homeloan.model.Property;

public interface PropertyService  {
	List<Property> selectAllLoans();

	Loan selectLoanService(int id) throws PropertyNotFoundException;

	List<Property> selectLoanByApplication_IdService(int Application_Id) throws PropertyNotFoundException;

	void updatepropertServicey(Property id,int a) throws PropertyNotFoundException;

	void deletepropertyService(int id) throws PropertyNotFoundException;

}
