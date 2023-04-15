package com.account.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.account.model.Account;

interface  IAccountRepo extends JpaRepository<Account, Integer> {

}
