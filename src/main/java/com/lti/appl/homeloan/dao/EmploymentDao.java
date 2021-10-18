package com.lti.appl.homeloan.dao;

import java.util.List;

import com.lti.appl.homeloan.exceptions.EmploymentNotFoundException;
import com.lti.appl.homeloan.model.Employment;

public interface EmploymentDao {
	void insertEmploymentDetail(Employment ref);
	List<Employment> selectAllEmploymentDetails();
	Employment selectEmploymentDetail(int id) throws EmploymentNotFoundException;
	void updateEmployment(Employment id,int a) throws EmploymentNotFoundException;
	void deleteEmployment(int id) throws EmploymentNotFoundException;

}
