package com.mpbank.mpbank.usecases.accounts;

import com.mpbank.mpbank.domain.interfaces.AddAccountInterface;
import com.mpbank.mpbank.domain.models.Account;
import com.mpbank.mpbank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddAccount implements AddAccountInterface {

  @Autowired
  AccountRepository repository;

  public void add(Account accountData) {
    repository.save(accountData);
  }
}
