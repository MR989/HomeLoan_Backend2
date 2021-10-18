package com.lti.appl.homeloan.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.appl.homeloan.exceptions.LoanTrackerNotFoundException;
import com.lti.appl.homeloan.model.LoanTracker;

@Repository
public class LoanTrackerDaoImpl extends BaseRepository implements LoanTrackerDao {
	int accountnum = 1;
	int amt = 0;
	String acnum = "";
	@Transactional
	public List<LoanTracker> selectAllLoanTrackers() {
		System.out.println("Select all loan trackers called....");
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery(" from LoanTracker");
		List<LoanTracker> loanTrackerList= query.getResultList();
		return loanTrackerList;
	}

	@Transactional
	public LoanTracker selectLoanTrackerByLoanId(int applicationId) throws LoanTrackerNotFoundException {
		EntityManager entityManager = getEntityManager();
		return entityManager.find(LoanTracker.class, applicationId);//based on PK
	}

	@Transactional
	public void updateLoanTrackerApprove(LoanTracker loanTracker) throws LoanTrackerNotFoundException {
		acnum = String.valueOf(accountnum);
		System.out.println("...." + amt);
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("UPDATE LOANTRACKER l SET l.verificationStatus='Approved' " + "WHERE l.trackerId= :tid");
		query.setParameter("tid", loanTracker.getTrackerId());
		query.executeUpdate();
		/*Query query1 = entityManager.createQuery("UPDATE LOANTRACKER l SET l.accountNum= :acno " + "WHERE l.trackerId= :tid");
		query1.setParameter("acno", acnum);
		query1.setParameter("tid", loanTracker.getTrackerId());
		query1.executeUpdate();
		Query query2 = entityManager.createQuery("UPDATE LOANTRACKER l SET l.finalApproval='Approved' " + "WHERE l.trackerId= :tid");
		query2.setParameter("tid", loanTracker.getTrackerId());
		query2.executeUpdate();
		Query query3 = entityManager.createQuery("UPDATE LOANTRACKER l SET l.balance= :amt " + "WHERE l.trackerId= :tid");
		query3.setParameter("amt", loanTracker.getBalance());
		query3.setParameter("tid", loanTracker.getTrackerId());
		query3.executeUpdate();
		*/
		accountnum++;
	}
	@Transactional
	public void updateLoanTrackerReject(LoanTracker loanTracker) throws LoanTrackerNotFoundException {
		EntityManager entityManager = getEntityManager();
		String sql = "UPDATE LOANTRACKER SET VERIFICATIONSTATUS='Rejected' WHERE TRACKERID=" + loanTracker.getTrackerId();
		Query query = entityManager.createNativeQuery(sql);
		System.out.println(sql);
		query.executeUpdate();
		String sql1 = "UPDATE LOANTRACKER SET FINALAPPROVAL='Rejected' WHERE TRACKERID=" + loanTracker.getTrackerId();
		Query query1 = entityManager.createNativeQuery(sql1);
		System.out.println(sql1);
		query1.executeUpdate();

	}
	
	@Transactional
	public List<LoanTracker> selectLoan(int trackerId, String debtorPhone) throws LoanTrackerNotFoundException {
		// TODO Auto-generated method stub
		EntityManager entityManager=getEntityManager();
		TypedQuery query = entityManager.createQuery("select lt from LOANTRACKER lt where lt.trackerId=:trackerId and lt.debtorPhone=:debtorPhone",LoanTracker.class);
		query.setParameter("trackerId", trackerId);
		query.setParameter("debtorPhone", debtorPhone);
		List<LoanTracker> loan = query.getResultList();
		System.out.println("leng : " + loan.size());
		/*for (LoanTracker lt : loan) {
			System.out.println("loantracker id : "+ lt.getTrackerId());
			System.out.println("applicationId :" + lt.getLoaneees());
			System.out.println("debtorPhone :" + lt.getDebtorPhone());
			System.out.println("verification status :" + lt.getVerificationStatus());
			System.out.println("approval : " + lt.getFinalApproval());
			System.out.println("remark : " + lt.getRemark());
		}*/
		return loan;
	}

	@Transactional
	public void insertloanTracker(LoanTracker ref) {
		// TODO Auto-generated method stub
		
	}


	@Transactional
	public LoanTracker selectloanTracker(int id) throws LoanTrackerNotFoundException {
		// TODO Auto-generated method stub
		EntityManager entityManager = getEntityManager();
		return entityManager.find(LoanTracker.class, id);
	
	}

	@Transactional
	public List<LoanTracker> selectloanTrackerByApplication_Id(int Application_Id) throws LoanTrackerNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Transactional
	public void updateloanTracker(LoanTracker id, int a) throws LoanTrackerNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("getAccountNum"+id.getAccountNum());
		System.out.println("getBalance"+id.getBalance());
		System.out.println("getDebtorPhone"+id.getDebtorPhone());
		System.out.println("getFinalApproval"+id.getFinalApproval());
		System.out.println("getRemark"+id.getRemark());
		System.out.println("getVerificationStatus"+id.getVerificationStatus());
		System.out.println("getTrackerId"+id.getTrackerId());
		System.out.println("a"+a);
		EntityManager entityManager1 = getEntityManager();
		Query query = entityManager1.createNativeQuery("UPDATE LOANTRACKER set APPLICATIONID=:vAPPLICATIONID where TRACKERID=:vTRACKERID");
        query.setParameter("vAPPLICATIONID", a);
        query.setParameter("vTRACKERID" ,id.getTrackerId());
        query.executeUpdate();
	}

	@Transactional
	public void deleteloanTracker(int id) throws LoanTrackerNotFoundException {
		// TODO Auto-generated method stub
		
	}

}
