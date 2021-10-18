package com.lti.appl.homeloan.dao;

import java.util.List;

import com.lti.appl.homeloan.exceptions.DocsNotFoundException;
import com.lti.appl.homeloan.model.Docs;

public interface DocsDao {
	void docs(Docs ref);

	List<Docs> selectAllDocs();

	Docs selectDocs(int id) throws DocsNotFoundException;

	List<Docs> selectDocsByDoc_Id(int docId) throws DocsNotFoundException;

	void updateDocs(Docs id,int a) throws DocsNotFoundException;

	void deleteDocs(int id) throws DocsNotFoundException;

}
