package com.mpbank.mpbank.usecases.accounts;

import com.mpbank.mpbank.domain.interfaces.LoadAccountsInterface;
import com.mpbank.mpbank.domain.models.Account;
import com.mpbank.mpbank.repository.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoadAccount implements LoadAccountsInterface {
  @Autowired
  AccountRepository repository;

  public Account loadAccountByDocument(String document) {
    Account acc = repository.findByDocument(document);
    return acc;
  }
}
