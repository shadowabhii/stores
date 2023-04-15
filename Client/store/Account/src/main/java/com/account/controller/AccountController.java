package com.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.account.model.Account;
import com.account.services.IAccountService;


@RestController
public class AccountController {
	
	@Autowired
	private IAccountService accountService;
	
	@GetMapping("/hello")
	public void hello()
	{
		
		System.out.println("hello");
		
	}
	
	@PostMapping("/createAccount")
	public Integer createAccount(@RequestBody Account account)
	{
		
		Integer id =accountService.createAccount(account);
		return id;
		
	}

}
