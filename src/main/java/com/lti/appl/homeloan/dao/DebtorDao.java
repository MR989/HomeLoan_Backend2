package com.lti.appl.homeloan.dao;

import java.util.List;

import com.lti.appl.homeloan.exceptions.DebtorNotFoundException;
import com.lti.appl.homeloan.model.Debtor;

public interface DebtorDao {
	List<Debtor> selectAllDebtors() ;
	Debtor selectDebtorByDebtorId(int debtorId) throws DebtorNotFoundException;
	void updateDebtor(Debtor id) throws DebtorNotFoundException;
	void deleteDebtor(int id) throws DebtorNotFoundException;
	Debtor selectDebtor(int id) throws DebtorNotFoundException;
	void insertDebtor(Debtor ref);
	 List<Debtor> selectDebtorByDebtorId(int id, String pass)throws DebtorNotFoundException ;
	 List<Debtor> selectDebtorByEmail(String email, String pass)throws DebtorNotFoundException ;

}
