package com.lti.appl.homeloan.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.appl.homeloan.exceptions.AdminNotFoundException;
import com.lti.appl.homeloan.exceptions.DebtorNotFoundException;
import com.lti.appl.homeloan.exceptions.LoanTrackerNotFoundException;
import com.lti.appl.homeloan.model.Admin;
import com.lti.appl.homeloan.model.Debtor;
import com.lti.appl.homeloan.model.Loan;
import com.lti.appl.homeloan.model.LoanTracker;
import com.lti.appl.homeloan.service.AdminServiceImpl;
import com.lti.appl.homeloan.service.DebtorServiceImpl;
import com.lti.appl.homeloan.service.LoanServiceImpl;
import com.lti.appl.homeloan.service.LoanTrackerServiceImpl;

@CrossOrigin(origins = "*")
@RestController // it is a specialized version of @Component - marker to receive web request
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	LoanServiceImpl loanApplicationService;
	@Autowired
	DebtorServiceImpl debtorServiceImplementation;
	@Autowired
	LoanTrackerServiceImpl loanTrackerService;
	@Autowired
	AdminServiceImpl adminService; 
	
	@GetMapping 
	@ResponseBody
	@RequestMapping(value = "/getAllLoanApplications")
	public List<Loan> getAllLoanApplications() {
		System.out.println("getAllLoanApplications().....");
		return loanApplicationService.selectAllLoanApplications();  
	}
	
	
	@GetMapping 
	@ResponseBody
	@RequestMapping(value = "/getAllDebtors")
	public List<Debtor> getAllDebtors() {
		System.out.println("getAllDebtors().....");
		return debtorServiceImplementation.selectAllDebtors();  
	}
	
	@GetMapping
	@ResponseBody
	@RequestMapping(value="/getDebtor/{dbid}")
	public Debtor getDebtorId(@PathVariable int dbid) {
		System.out.println("getDebtorId()...method ");
		try {
			return debtorServiceImplementation.selectDebtorByDebtorId(dbid); 
		} catch (DebtorNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@GetMapping 
	@ResponseBody
	@RequestMapping(value = "/getAllLoanTrackers")
	public List<LoanTracker> getAllLoanTrackers() {
		System.out.println("getAllLoanTrackers().....");
		return loanTrackerService.selectAllLoanTrackers();
	}
	
	@GetMapping 
	@ResponseBody
	@RequestMapping(value = "/getAllAdmins")
	public List<Admin> getAllLoanAdmins() {
		System.out.println("getAllAdmins().....");
		return adminService.selectAllAdmins();
	}
	
	@GetMapping
	@ResponseBody
	@RequestMapping(value="/getAdmin/{auname}/{aupwd}")
	public List<Admin> getAdmin(@PathVariable String auname, @PathVariable String aupwd) {
		System.out.println("getAdmin()...method ");
		try {
			return adminService.selectAdminByUsername(auname,aupwd);
		} catch (AdminNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@GetMapping
	@ResponseBody
	@RequestMapping(value="/getLoanTracker/{ltno}")
	public LoanTracker getLoanTracker(@PathVariable int ltno) {
		System.out.println("getLoanTracker()...method ");

		try {
			return loanTrackerService.selectLoanTrackerByLoanId(ltno); 
		} catch (LoanTrackerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	/*@PutMapping("/updateLoanTracker/{tid}")
	public LoanTracker updateLoanTracker(@PathVariable(value = "tid") int trackerId, @RequestBody LoanTracker loanTrackerDetails) throws LoanTrackerNotFoundException {
		LoanTracker loantracker = loanTrackerService.selectLoanTrackerByLoanId(trackerId);
		loantracker.setFinalApproval(loanTrackerDetails.getFinalApproval());
		return null;*/
	
	
	@PutMapping(value = "/updateLoanTrackerApprove")
	public String updateLoanTrackerApprove(@RequestBody LoanTracker lt) throws SQLException {
		System.out.println("Update Loan Tracker Controller(.....");
		try {
			loanTrackerService.updateLoanTrackerApprove(lt);
		} catch (LoanTrackerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Approved Successfully!!!";
	}
	
	@PutMapping(value = "/updateLoanTrackerReject")
	public String updateLoanTrackerReject(@RequestBody LoanTracker lt) {
		System.out.println("Update Loan Tracker Controller(.....");
		try {
			loanTrackerService.updateLoanTrackerReject(lt);
		} catch (LoanTrackerNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Rejected Successfully!!!";
	}

}
