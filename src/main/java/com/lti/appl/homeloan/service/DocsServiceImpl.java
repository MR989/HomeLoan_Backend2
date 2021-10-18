package com.lti.appl.homeloan.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lti.appl.homeloan.exceptions.DocsNotFoundException;
import com.lti.appl.homeloan.model.Debtor;
import com.lti.appl.homeloan.model.Docs;

@Service
public class DocsServiceImpl implements DocsService  {
	@Override
	public void insertDocsService(Docs ref) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Docs> selectAllDocsService() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Debtor selectDocsService(int id) throws DocsNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Docs> selectDocsByDocIdService(int id) throws DocsNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDocsService(Docs id) throws DocsNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteDocsService(int id) throws DocsNotFoundException {
		// TODO Auto-generated method stub
		
	}

}
