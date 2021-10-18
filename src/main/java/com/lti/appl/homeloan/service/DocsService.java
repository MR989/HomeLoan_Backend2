package com.lti.appl.homeloan.service;

import java.util.List;

import com.lti.appl.homeloan.exceptions.DocsNotFoundException;
import com.lti.appl.homeloan.model.Debtor;
import com.lti.appl.homeloan.model.Docs;

public interface DocsService {
	void insertDocsService(Docs ref);//(int std, String div, int roll);
	List<Docs> selectAllDocsService();
	Debtor selectDocsService(int id) throws DocsNotFoundException;
	List<Docs> selectDocsByDocIdService(int id)throws DocsNotFoundException ;
	void updateDocsService(Docs id) throws DocsNotFoundException;
	void deleteDocsService(int id) throws DocsNotFoundException;

}
