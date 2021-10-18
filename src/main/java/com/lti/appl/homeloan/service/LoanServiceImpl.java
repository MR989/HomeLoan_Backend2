package com.lti.appl.homeloan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.appl.homeloan.dao.LoanDaoImpl;
import com.lti.appl.homeloan.exceptions.LoanNotFoundException;
import com.lti.appl.homeloan.model.Loan;

@Service
public class LoanServiceImpl implements LoanService {
	@Autowired
	LoanDaoImpl loanApplicationRepo;
	@Override
	public List<Loan> selectAllLoanApplications() {
		System.out.println("LoanApplicationServiceImpl: Layer 4 ");
		return loanApplicationRepo.selectAllLoans();
	}

	@Override
	public List<Loan> selectLoanApplicationByLoanId(int LoanId) throws LoanNotFoundException{
		System.out.println("LoanApplicationServiceImpl: Layer 4 ");
		return loanApplicationRepo.selectLoanByApplication_Id(LoanId);
	}

	@Override
	public void insertLoanService(Loan ref) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Loan> selectAllLoans() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Loan selectLoanService(int id) throws LoanNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Loan> selectLoanByApplication_IdService(int Application_Id) throws LoanNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateLoanService(Loan id, int a) throws LoanNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteLoanService(int id) throws LoanNotFoundException {
		// TODO Auto-generated method stub
		
	}

}
