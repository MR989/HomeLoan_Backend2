package com.lti.appl.homeloan.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "DOCS")

public class Docs {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="DOCID")
	@PrimaryKeyJoinColumn
	private int docId;
	
	@Column(name="UPLOADAADHAR")
	private String uploadAadhar;
	
	@Column(name="UPLOADVOTER")
	private String uploadVoter;
	
	@Column(name="UPLOADPAN")
	private String uploadPan;
	
	@Column(name="UPLOADSALARYSLIP")
	private String uploadSalaryslip;
	
	@Column(name="UPLOADLOA")
	private String uploadLoa;
	
	@Column(name="UPLOADNOC")
	private String uploadNoc;
	
	@Column(name="UPLOADSALEAGREEMENT")
	private String uploadSaleagreement;
	
	@OneToOne
	@JoinColumn(name="DEBTORID")
	private Debtor debtors;

	public int getDocId() {
		return docId;
	}

	public void setDocId(int docId) {
		this.docId = docId;
	}

	public String getUploadAadhar() {
		return uploadAadhar;
	}

	public void setUploadAadhar(String uploadAadhar) {
		this.uploadAadhar = uploadAadhar;
	}

	public String getUploadVoter() {
		return uploadVoter;
	}

	public void setUploadVoter(String uploadVoter) {
		this.uploadVoter = uploadVoter;
	}

	public String getUploadPan() {
		return uploadPan;
	}

	public void setUploadPan(String uploadPan) {
		this.uploadPan = uploadPan;
	}

	public String getUploadSalaryslip() {
		return uploadSalaryslip;
	}

	public void setUploadSalaryslip(String uploadSalaryslip) {
		this.uploadSalaryslip = uploadSalaryslip;
	}

	public String getUploadLoa() {
		return uploadLoa;
	}

	public void setUploadLoa(String uploadLoa) {
		this.uploadLoa = uploadLoa;
	}

	public String getUploadNoc() {
		return uploadNoc;
	}

	public void setUploadNoc(String uploadNoc) {
		this.uploadNoc = uploadNoc;
	}

	public String getUploadSaleagreement() {
		return uploadSaleagreement;
	}

	public void setUploadSaleagreement(String uploadSaleagreement) {
		this.uploadSaleagreement = uploadSaleagreement;
	}
	@JsonIgnore
	public Debtor getDebtors() {
		return debtors;
	}

	public void setDebtors(Debtor debtors) {
		this.debtors = debtors;
	}

	public Docs(int docId, String uploadAadhar, String uploadVoter, String uploadPan, String uploadSalaryslip,
			String uploadLoa, String uploadNoc, String uploadSaleagreement, Debtor debtors) {
		super();
		this.docId = docId;
		this.uploadAadhar = uploadAadhar;
		this.uploadVoter = uploadVoter;
		this.uploadPan = uploadPan;
		this.uploadSalaryslip = uploadSalaryslip;
		this.uploadLoa = uploadLoa;
		this.uploadNoc = uploadNoc;
		this.uploadSaleagreement = uploadSaleagreement;
		this.debtors = debtors;
	}

	public Docs(int docId, String uploadAadhar, String uploadVoter, String uploadPan, String uploadSalaryslip,
			String uploadLoa, String uploadNoc, String uploadSaleagreement) {
		super();
		this.docId = docId;
		this.uploadAadhar = uploadAadhar;
		this.uploadVoter = uploadVoter;
		this.uploadPan = uploadPan;
		this.uploadSalaryslip = uploadSalaryslip;
		this.uploadLoa = uploadLoa;
		this.uploadNoc = uploadNoc;
		this.uploadSaleagreement = uploadSaleagreement;
	}

	public Docs(String uploadAadhar, String uploadVoter, String uploadPan, String uploadSalaryslip, String uploadLoa,
			String uploadNoc, String uploadSaleagreement, Debtor debtors) {
		super();
		this.uploadAadhar = uploadAadhar;
		this.uploadVoter = uploadVoter;
		this.uploadPan = uploadPan;
		this.uploadSalaryslip = uploadSalaryslip;
		this.uploadLoa = uploadLoa;
		this.uploadNoc = uploadNoc;
		this.uploadSaleagreement = uploadSaleagreement;
		this.debtors = debtors;
	}

	public Docs() {
		super();
		// TODO Auto-generated constructor stub
	}

}
