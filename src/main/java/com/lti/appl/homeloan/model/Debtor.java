package com.lti.appl.homeloan.model;
import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table(name = "DEBTOR")

public class Debtor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="DEBTORID")
	@PrimaryKeyJoinColumn
	private int debtorId;
	
	@Column(name="DEBTORFNAME")
	private String debtorFName;

	@Column(name="DEBTORMNAME")
	private String debtorMName;
	
	@Column(name="DEBTORLNAME")
	private String debtorLName;

	@Column(name="DEBTORADDRESS")
	private String debtorAddress;

	@Column(name="DEBTOREMAIL")
	private String debtorEmail;

	@Column(name="DEBTORPASSWORD")
	private String debtorPassword;
	
	@Column(name="DEBTORCONFIRMPASS")
	private String debtorConfirmPass;
	
	@Column(name="DEBTORPHONE")
	private String debtorPhone;
	
	@Column(name="DEBTORDOB")
	private Date debtorDOB;
	
	@Column(name="DEBTORGENDER")
	private String debtorGender;

	@Column(name="DEBTORNATIONALITY")
	private String debtorNationality;
	
	@Column(name="DEBTORAADHAR")
	private String debtorAadhar;
	
	@Column(name="DEBTORPANCARD")
	private String debtorPancard;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "debtors")
	private Docs docs;
	

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "debtors1")
	private Set<Loan> loanee;

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "debtors2")
	private Set<Property> Propertiess;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "debtors3")
	private Employment employments;

	@Override
	public String toString() {
		return "Debtor [debtorId=" + debtorId + ", debtorFName=" + debtorFName + ", debtorMName=" + debtorMName
				+ ", debtorLName=" + debtorLName + ", debtorAddress=" + debtorAddress + ", debtorEmail=" + debtorEmail
				+ ", debtorPassword=" + debtorPassword + ", debtorConfirmPass=" + debtorConfirmPass + ", debtorPhone="
				+ debtorPhone + ", debtorDOB=" + debtorDOB + ", debtorGender=" + debtorGender + ", debtorNationality="
				+ debtorNationality + ", debtorAadhar=" + debtorAadhar + ", debtorPancard=" + debtorPancard + ", docs="
				+ docs + ", loanee=" + loanee + ", Propertiess=" + Propertiess + ", employments=" + employments
				+ ", getDebtorId()=" + getDebtorId() + ", getDebtorFName()=" + getDebtorFName() + ", getDebtorMName()="
				+ getDebtorMName() + ", getDebtorLName()=" + getDebtorLName() + ", getDebtorAddress()="
				+ getDebtorAddress() + ", getDebtorEmail()=" + getDebtorEmail() + ", getDebtorPassword()="
				+ getDebtorPassword() + ", getDebtorConfirmPass()=" + getDebtorConfirmPass() + ", getDebtorPhone()="
				+ getDebtorPhone() + ", getDebtorDOB()=" + getDebtorDOB() + ", getDebtorGender()=" + getDebtorGender()
				+ ", getDebtorNationality()=" + getDebtorNationality() + ", getDebtorAadhar()=" + getDebtorAadhar()
				+ ", getDebtorPancard()=" + getDebtorPancard() + ", getDocs()=" + getDocs() + ", getLoanee()="
				+ getLoanee() + ", getPropertiess()=" + getPropertiess() + ", getEmployments()=" + getEmployments()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public Debtor(int debtorId, String debtorFName, String debtorMName, String debtorLName, String debtorAddress,
			String debtorEmail, String debtorPassword, String debtorConfirmPass, String debtorPhone, Date debtorDOB,
			String debtorGender, String debtorNationality, String debtorAadhar, String debtorPancard, Docs docs,
			Set<Loan> loanee, Set<Property> propertiess, Employment employments) {
		super();
		this.debtorId = debtorId;
		this.debtorFName = debtorFName;
		this.debtorMName = debtorMName;
		this.debtorLName = debtorLName;
		this.debtorAddress = debtorAddress;
		this.debtorEmail = debtorEmail;
		this.debtorPassword = debtorPassword;
		this.debtorConfirmPass = debtorConfirmPass;
		this.debtorPhone = debtorPhone;
		this.debtorDOB = debtorDOB;
		this.debtorGender = debtorGender;
		this.debtorNationality = debtorNationality;
		this.debtorAadhar = debtorAadhar;
		this.debtorPancard = debtorPancard;
		this.docs = docs;
		this.loanee = loanee;
		Propertiess = propertiess;
		this.employments = employments;
	}

	public Debtor(int debtorId,String debtorFName, String debtorMName, String debtorLName, String debtorAddress, String debtorEmail,
			String debtorPassword, String debtorConfirmPass, String debtorPhone, Date debtorDOB, String debtorGender,
			String debtorNationality, String debtorAadhar, String debtorPancard) {
		super();
		this.debtorId = debtorId;
		this.debtorFName = debtorFName;
		this.debtorMName = debtorMName;
		this.debtorLName = debtorLName;
		this.debtorAddress = debtorAddress;
		this.debtorEmail = debtorEmail;
		this.debtorPassword = debtorPassword;
		this.debtorConfirmPass = debtorConfirmPass;
		this.debtorPhone = debtorPhone;
		this.debtorDOB = debtorDOB;
		this.debtorGender = debtorGender;
		this.debtorNationality = debtorNationality;
		this.debtorAadhar = debtorAadhar;
		this.debtorPancard = debtorPancard;
	}

	public Debtor(String debtorFName, String debtorMName, String debtorLName, String debtorAddress, String debtorEmail,
			String debtorPassword, String debtorConfirmPass, String debtorPhone, Date debtorDOB, String debtorGender,
			String debtorNationality, String debtorAadhar, String debtorPancard) {
		super();
		this.debtorFName = debtorFName;
		this.debtorMName = debtorMName;
		this.debtorLName = debtorLName;
		this.debtorAddress = debtorAddress;
		this.debtorEmail = debtorEmail;
		this.debtorPassword = debtorPassword;
		this.debtorConfirmPass = debtorConfirmPass;
		this.debtorPhone = debtorPhone;
		this.debtorDOB = debtorDOB;
		this.debtorGender = debtorGender;
		this.debtorNationality = debtorNationality;
		this.debtorAadhar = debtorAadhar;
		this.debtorPancard = debtorPancard;
	}

	public int getDebtorId() {
		return debtorId;
	}

	public void setDebtorId(int debtorId) {
		this.debtorId = debtorId;
	}

	public String getDebtorFName() {
		return debtorFName;
	}

	public void setDebtorFName(String debtorFName) {
		this.debtorFName = debtorFName;
	}

	public String getDebtorMName() {
		return debtorMName;
	}

	public void setDebtorMName(String debtorMName) {
		this.debtorMName = debtorMName;
	}

	public String getDebtorLName() {
		return debtorLName;
	}

	public void setDebtorLName(String debtorLName) {
		this.debtorLName = debtorLName;
	}

	public String getDebtorAddress() {
		return debtorAddress;
	}

	public void setDebtorAddress(String debtorAddress) {
		this.debtorAddress = debtorAddress;
	}

	public String getDebtorEmail() {
		return debtorEmail;
	}

	public void setDebtorEmail(String debtorEmail) {
		this.debtorEmail = debtorEmail;
	}

	public String getDebtorPassword() {
		return debtorPassword;
	}

	public void setDebtorPassword(String debtorPassword) {
		this.debtorPassword = debtorPassword;
	}

	public String getDebtorConfirmPass() {
		return debtorConfirmPass;
	}

	public void setDebtorConfirmPass(String debtorConfirmPass) {
		this.debtorConfirmPass = debtorConfirmPass;
	}

	public String getDebtorPhone() {
		return debtorPhone;
	}

	public void setDebtorPhone(String debtorPhone) {
		this.debtorPhone = debtorPhone;
	}

	public Date getDebtorDOB() {
		return debtorDOB;
	}

	public void setDebtorDOB(Date debtorDOB) {
		this.debtorDOB = debtorDOB;
	}

	public String getDebtorGender() {
		return debtorGender;
	}

	public void setDebtorGender(String debtorGender) {
		this.debtorGender = debtorGender;
	}

	public String getDebtorNationality() {
		return debtorNationality;
	}

	public void setDebtorNationality(String debtorNationality) {
		this.debtorNationality = debtorNationality;
	}

	public String getDebtorAadhar() {
		return debtorAadhar;
	}

	public void setDebtorAadhar(String debtorAadhar) {
		this.debtorAadhar = debtorAadhar;
	}

	public String getDebtorPancard() {
		return debtorPancard;
	}

	public void setDebtorPancard(String debtorPancard) {
		this.debtorPancard = debtorPancard;
	}

	public Docs getDocs() {
		return docs;
	}

	public void setDocs(Docs docs) {
		this.docs = docs;
	}

	public Set<Loan> getLoanee() {
		return loanee;
	}

	public void setLoanee(Set<Loan> loanee) {
		this.loanee = loanee;
	}

	public Set<Property> getPropertiess() {
		return Propertiess;
	}

	public void setPropertiess(Set<Property> propertiess) {
		Propertiess = propertiess;
	}

	public Employment getEmployments() {
		return employments;
	}

	public void setEmployments(Employment employments) {
		this.employments = employments;
	}

	public Debtor() {
		super();
		// TODO Auto-generated constructor stub
	}

}
