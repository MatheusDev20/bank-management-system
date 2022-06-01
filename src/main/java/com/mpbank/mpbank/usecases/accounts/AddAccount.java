package com.mpbank.mpbank.usecases.accounts;

import com.mpbank.mpbank.domain.interfaces.AddAccountInterface;
import com.mpbank.mpbank.domain.models.Account;
import com.mpbank.mpbank.dto.accounts.CreateAccountDto;
import com.mpbank.mpbank.repository.AccountRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddAccount implements AddAccountInterface {

  @Autowired
  AccountRepository repository;

  @Autowired
  private ModelMapper modelMapper;

  @Override
  public void add(CreateAccountDto accountData) {
    Account acc = modelMapper.map(accountData, Account.class);
    acc.setBalance(0.00);
    repository.save(acc);
  }
}
