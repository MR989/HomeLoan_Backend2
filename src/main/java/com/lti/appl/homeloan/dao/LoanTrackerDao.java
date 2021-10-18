package com.lti.appl.homeloan.dao;

import java.sql.SQLException;
import java.util.List;

import com.lti.appl.homeloan.exceptions.LoanTrackerNotFoundException;
import com.lti.appl.homeloan.model.LoanTracker;

public interface LoanTrackerDao {
	List<LoanTracker> selectAllLoanTrackers() ;
	LoanTracker selectLoanTrackerByLoanId(int LoanId) throws LoanTrackerNotFoundException;
	void updateLoanTrackerApprove(LoanTracker loanTracker) throws LoanTrackerNotFoundException, SQLException;
	void updateLoanTrackerReject(LoanTracker loanTracker) throws LoanTrackerNotFoundException;
	LoanTracker selectloanTracker(int id) throws LoanTrackerNotFoundException;
	List<LoanTracker> selectloanTrackerByApplication_Id(int Application_Id) throws LoanTrackerNotFoundException;
	void updateloanTracker(LoanTracker id,int a) throws LoanTrackerNotFoundException;
	void deleteloanTracker(int id) throws LoanTrackerNotFoundException;
	void insertloanTracker(LoanTracker ref);
	List<LoanTracker> selectLoan(int trackerId, String debtorPhone) throws LoanTrackerNotFoundException;

}
