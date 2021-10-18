package com.lti.appl.homeloan.service;

import java.util.List;

import com.lti.appl.homeloan.exceptions.LoanNotFoundException;
import com.lti.appl.homeloan.model.Loan;

public interface LoanService {
	List<Loan> selectLoanApplicationByLoanId(int LoanId) throws LoanNotFoundException ;
	List<Loan> selectAllLoanApplications();
	void insertLoanService(Loan ref);
	List<Loan> selectAllLoans();
	Loan selectLoanService(int id) throws LoanNotFoundException;
	List<Loan> selectLoanByApplication_IdService(int Application_Id) throws LoanNotFoundException;
	void updateLoanService(Loan id,int a) throws LoanNotFoundException;
	void deleteLoanService(int id) throws LoanNotFoundException;

}
