package com.lti.appl.homeloan.service;

import java.sql.SQLException;
import java.util.List;

import com.lti.appl.homeloan.exceptions.LoanTrackerNotFoundException;
import com.lti.appl.homeloan.model.Loan;
import com.lti.appl.homeloan.model.LoanTracker;

public interface LoanTrackerService {
	LoanTracker selectLoanTrackerByLoanId(int LoanId) throws LoanTrackerNotFoundException ;
	List<LoanTracker> selectAllLoanTrackers();
	void updateLoanTrackerApprove(LoanTracker loanTracker) throws LoanTrackerNotFoundException, SQLException;
	void updateLoanTrackerReject(LoanTracker loanTracker) throws LoanTrackerNotFoundException;
	void insertloanTrackerService(LoanTracker ref);
	List<LoanTracker> selectAllLoansService();
	Loan selectloanTrackerService(int id) throws LoanTrackerNotFoundException;
	List<LoanTracker> selectloanTrackerByApplication_IdService(int Application_Id) throws LoanTrackerNotFoundException;
	void updateloanTrackerService(LoanTracker id,int a) throws LoanTrackerNotFoundException;
	void deleteloanTrackerService(int id) throws LoanTrackerNotFoundException;
	List<LoanTracker> selectLoanService(int trackerId, String debtorPhone) throws LoanTrackerNotFoundException;

}
