package com.lti.appl.homeloan.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "LOANTRACKER")

public class LoanTracker {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TRACKERID")
	@PrimaryKeyJoinColumn
	private int trackerId;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "APPLICATIONID")
	private Loan loaneees;

	@Column(name = "DEBTORPHONE")
	private String debtorPhone;

	@Column(name = "VERIFICATIONSTATUS")
	private String verificationStatus;

	@Column(name = "FINALAPPROVAL")
	private String finalApproval;

	@Column(name = "REMARK")
	private String remark;

	@Column(name = "ACCOUNTNUM")
	private String accountNum;

	@Column(name = "BALANCE")
	private int balance;

	public int getTrackerId() {
		return trackerId;
	}

	public void setTrackerId(int trackerId) {
		this.trackerId = trackerId;
	}
	@JsonIgnore
	public Loan getLoaneees() {
		return loaneees;
	}

	public void setLoaneees(Loan loaneees) {
		this.loaneees = loaneees;
	}

	public String getDebtorPhone() {
		return debtorPhone;
	}

	public void setDebtorPhone(String debtorPhone) {
		this.debtorPhone = debtorPhone;
	}

	public String getVerificationStatus() {
		return verificationStatus;
	}

	public void setVerificationStatus(String verificationStatus) {
		this.verificationStatus = verificationStatus;
	}

	public String getFinalApproval() {
		return finalApproval;
	}

	public void setFinalApproval(String finalApproval) {
		this.finalApproval = finalApproval;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public LoanTracker(int trackerId, Loan loaneees, String debtorPhone, String verificationStatus,
			String finalApproval, String remark, String accountNum, int balance) {
		super();
		this.trackerId = trackerId;
		this.loaneees = loaneees;
		this.debtorPhone = debtorPhone;
		this.verificationStatus = verificationStatus;
		this.finalApproval = finalApproval;
		this.remark = remark;
		this.accountNum = accountNum;
		this.balance = balance;
	}

	public LoanTracker(int trackerId, String debtorPhone, String verificationStatus, String finalApproval,
			String remark, String accountNum, int balance) {
		super();
		this.trackerId = trackerId;
		this.debtorPhone = debtorPhone;
		this.verificationStatus = verificationStatus;
		this.finalApproval = finalApproval;
		this.remark = remark;
		this.accountNum = accountNum;
		this.balance = balance;
	}

	public LoanTracker(Loan loaneees, String debtorPhone, String verificationStatus, String finalApproval,
			String remark, String accountNum, int balance) {
		super();
		this.loaneees = loaneees;
		this.debtorPhone = debtorPhone;
		this.verificationStatus = verificationStatus;
		this.finalApproval = finalApproval;
		this.remark = remark;
		this.accountNum = accountNum;
		this.balance = balance;
	}

	public LoanTracker() {
		super();
		// TODO Auto-generated constructor stub
	}

}
