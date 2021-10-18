package com.lti.appl.homeloan.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name = "LOAN")

public class Loan {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="APPLICATIONID")
	@PrimaryKeyJoinColumn
	private int applicationId;
	
	@Column(name="DEBTORSALARY")
	private int debtorSalary;
	
	@Column(name="LOANAMOUNT")
	private int loanAmount;
	
	@Column(name="INTERESTRATE")
	private int interestRate;
	
	@Column(name="TENURE")
	private int tenure;
	
	@ManyToOne
	@JoinColumn(name="DEBTORID")
	private Debtor debtors1;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "loaneees")
	private LoanTracker loanTrackers;

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	public int getDebtorSalary() {
		return debtorSalary;
	}

	public void setDebtorSalary(int debtorSalary) {
		this.debtorSalary = debtorSalary;
	}

	public int getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(int loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(int interestRate) {
		this.interestRate = interestRate;
	}

	public int getTenure() {
		return tenure;
	}

	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	@JsonIgnore
	public Debtor getDebtors1() {
		return debtors1;
	}

	public void setDebtors1(Debtor debtors1) {
		this.debtors1 = debtors1;
	}

	public LoanTracker getLoanTrackers() {
		return loanTrackers;
	}

	public void setLoanTrackers(LoanTracker loanTrackers) {
		this.loanTrackers = loanTrackers;
	}

	public Loan(int applicationId, int debtorSalary, int loanAmount, int interestRate, int tenure, Debtor debtors1,
			LoanTracker loanTrackers) {
		super();
		this.applicationId = applicationId;
		this.debtorSalary = debtorSalary;
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
		this.tenure = tenure;
		this.debtors1 = debtors1;
		this.loanTrackers = loanTrackers;
	}

	public Loan(int applicationId, int debtorSalary, int loanAmount, int interestRate, int tenure,Debtor debtors1) {
		super();
		this.applicationId = applicationId;
		this.debtorSalary = debtorSalary;
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
		this.tenure = tenure;
		this.debtors1 = debtors1;
	}

	public Loan(int applicationId, int debtorSalary, int loanAmount, int interestRate, int tenure) {
		super();
		this.applicationId = applicationId;
		this.debtorSalary = debtorSalary;
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
		this.tenure = tenure;
	}

	public Loan(int debtorSalary, int loanAmount, int interestRate, int tenure,Debtor debtors1) {
		super();
		this.debtorSalary = debtorSalary;
		this.loanAmount = loanAmount;
		this.interestRate = interestRate;
		this.tenure = tenure;
		this.debtors1 = debtors1;
	}

	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}



}
