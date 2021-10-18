package com.lti.appl.homeloan.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.appl.homeloan.exceptions.DocsNotFoundException;
import com.lti.appl.homeloan.model.Debtor;
import com.lti.appl.homeloan.model.Docs;

@Repository
public class DocsDaoImpl extends BaseRepository implements DocsDao {
	@Transactional
	public void docs(Docs ref) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public List<Docs> selectAllDocs() {
		// TODO Auto-generated method stub
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery(" from Docs");
		List<Docs> docList = query.getResultList();
		return docList;
	}

	@Transactional
	public Docs selectDocs(int id) throws DocsNotFoundException {
		// TODO Auto-generated method stub
		EntityManager entityManager = getEntityManager();
		return entityManager.find(Docs.class, id);
	}

	@Transactional
	public List<Docs> selectDocsByDoc_Id(int docId) throws DocsNotFoundException {
		// TODO Auto-generated method stub
		EntityManager entityManager = getEntityManager();
		Query query = entityManager.createQuery("select e from Docs e where e.DOCID = :vDOCID");
		query.setParameter("vDOCID", docId);
		List<Debtor> incListAsPerJob = query.getResultList();
		return null;
	}

	@Transactional
	public void updateDocs(Docs id, int a) throws DocsNotFoundException {
		// TODO Auto-generated method stub
		EntityManager entityManager1 = getEntityManager();
		Query query = entityManager1.createNativeQuery("UPDATE Docs set DEBTORID=:vDEBTORID where DOCID =:vDOCID");
        query.setParameter("vDEBTORID", a);
        query.setParameter("vDOCID",id.getDocId());
        query.executeUpdate();
	}

	@Transactional
	public void deleteDocs(int id) throws DocsNotFoundException {
		// TODO Auto-generated method stub
		
	}

}
