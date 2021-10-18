package com.lti.appl.homeloan.dao;

import java.util.List;

import com.lti.appl.homeloan.exceptions.LoanNotFoundException;
import com.lti.appl.homeloan.model.Loan;

public interface LoanDao {
	void insertLoan(Loan ref);

	List<Loan> selectAllLoans();

	Loan selectLoan(int id) throws LoanNotFoundException;

	List<Loan> selectLoanByApplication_Id(int Application_Id) throws LoanNotFoundException;

	void updateLoan(Loan id,int a) throws LoanNotFoundException;

	void deleteLoan(int id) throws LoanNotFoundException;

}
