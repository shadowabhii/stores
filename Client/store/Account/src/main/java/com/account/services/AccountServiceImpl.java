package com.account.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.model.Account;


@Service
public class AccountServiceImpl implements IAccountService {
	
	
	@Autowired
	private IAccountRepo accountRepo;

	@Override
	public Integer createAccount(Account account) {
		Account creatingAccount = accountRepo.save(account);
		Integer id = creatingAccount.getaId();
		return id;
	}

}
