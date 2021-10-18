package com.lti.appl.homeloan.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lti.appl.homeloan.exceptions.PropertyNotFoundException;
import com.lti.appl.homeloan.model.Loan;
import com.lti.appl.homeloan.model.Property;

@Service
public class PropertyServiceImpl implements PropertyService {
	@Override
	public List<Property> selectAllLoans() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loan selectLoanService(int id) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Property> selectLoanByApplication_IdService(int Application_Id) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatepropertServicey(Property id, int a) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletepropertyService(int id) throws PropertyNotFoundException {
		// TODO Auto-generated method stub
		
	}

}
