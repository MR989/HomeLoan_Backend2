package com.lti.appl.homeloan.service;

import java.util.List;

import com.lti.appl.homeloan.exceptions.EmploymentNotFoundException;
import com.lti.appl.homeloan.model.Employment;

public interface EmploymentService {
	void insertEmploymentDetailService(Employment ref);
	List<Employment> selectAllEmploymentDetailsService();
	Employment selectEmploymentDetailService(int id) throws EmploymentNotFoundException;
	void updateEmploymentService(Employment id,int a) throws EmploymentNotFoundException;
	void deleteEmploymentService(int id) throws EmploymentNotFoundException;

}
