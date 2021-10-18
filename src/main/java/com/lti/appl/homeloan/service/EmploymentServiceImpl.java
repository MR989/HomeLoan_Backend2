package com.lti.appl.homeloan.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lti.appl.homeloan.exceptions.EmploymentNotFoundException;
import com.lti.appl.homeloan.model.Employment;

@Service
public class EmploymentServiceImpl implements EmploymentService {
	@Override
	public void insertEmploymentDetailService(Employment ref) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Employment> selectAllEmploymentDetailsService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employment selectEmploymentDetailService(int id) throws EmploymentNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEmploymentService(Employment id, int a) throws EmploymentNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmploymentService(int id) throws EmploymentNotFoundException {
		// TODO Auto-generated method stub
		
	}


}
