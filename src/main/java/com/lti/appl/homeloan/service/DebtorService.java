package com.lti.appl.homeloan.service;

import java.util.List;

import com.lti.appl.homeloan.exceptions.DebtorNotFoundException;
import com.lti.appl.homeloan.model.Debtor;

public interface DebtorService {
	List<Debtor> selectAllDebtors();
	Debtor selectDebtorByDebtorId(int debtorId) throws DebtorNotFoundException;
	void insertDebtorService(Debtor ref);
	List<Debtor> selectAllDebtorsService();
	Debtor selectDebtorService(int id) throws DebtorNotFoundException;
	List<Debtor> selectDebtorByDebtorIdService(int id)throws DebtorNotFoundException ;
	void updateDebtorService(Debtor id) throws DebtorNotFoundException;
	void deleteDebtorService(int id) throws DebtorNotFoundException;
	List<Debtor> selectDebtorByDebtorIdService(int id, String pass)throws DebtorNotFoundException ;
	List<Debtor> selectDebtorByEmailService(String email, String pass)throws DebtorNotFoundException ;

}
