package com.lti.appl.homeloan.model;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "EMPLOYMENT")
public class Employment {
	

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="EMPLOYMENTID")
		@PrimaryKeyJoinColumn
		private int employmentId;
		
		@Column(name="EMPLOYMENTTYPE")
		private String employmentType;
		
		@Column(name="RETIREMENTAGE")
		private int retirementAge;

		
		@Column(name="ORGANIZATIONTYPE")
		private String organizationType;
		
		@OneToOne
		@JoinColumn(name="DEBTORID")
		private Debtor debtors3;

		public int getEmploymentId() {
			return employmentId;
		}

		public void setEmploymentId(int employmentId) {
			this.employmentId = employmentId;
		}

		public String getEmploymentType() {
			return employmentType;
		}

		public void setEmploymentType(String employmentType) {
			this.employmentType = employmentType;
		}

		public int getRetirementAge() {
			return retirementAge;
		}

		public void setRetirementAge(int retirementAge) {
			this.retirementAge = retirementAge;
		}

		public String getOrganizationType() {
			return organizationType;
		}

		public void setOrganizationType(String organizationType) {
			this.organizationType = organizationType;
		}
		@JsonIgnore
		public Debtor getDebtors3() {
			return debtors3;
		}

		public void setDebtors3(Debtor debtors3) {
			this.debtors3 = debtors3;
		}

		public Employment(int employmentId, String employmentType, int retirementAge, String organizationType,
				Debtor debtors3) {
			super();
			this.employmentId = employmentId;
			this.employmentType = employmentType;
			this.retirementAge = retirementAge;
			this.organizationType = organizationType;
			this.debtors3 = debtors3;
		}

		public Employment(int employmentId, String employmentType, int retirementAge, String organizationType) {
			super();
			this.employmentId = employmentId;
			this.employmentType = employmentType;
			this.retirementAge = retirementAge;
			this.organizationType = organizationType;
		}

		public Employment(String employmentType, int retirementAge, String organizationType, Debtor debtors3) {
			super();
			this.employmentType = employmentType;
			this.retirementAge = retirementAge;
			this.organizationType = organizationType;
			this.debtors3 = debtors3;
		}

		public Employment() {
			super();
			// TODO Auto-generated constructor stub
		}

}
