package com.mpbank.mpbank.usecases.accounts;

import java.util.List;

import com.mpbank.mpbank.domain.interfaces.LoadAccountsInterface;
import com.mpbank.mpbank.domain.models.Account;
import com.mpbank.mpbank.repository.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoadAccount implements LoadAccountsInterface {
  @Autowired
  AccountRepository repository;

  public List<Account> loadAccountByDocument(String document) {
    List<Account> acc = repository.findByDocument(document);
    return acc;
  }

  public Account loadAccountByPhone(String phone) {
    Account acc = repository.findByPhone(phone);
    return acc;
  }
}
