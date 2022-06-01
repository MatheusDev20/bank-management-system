package com.mpbank.mpbank.domain.interfaces;

import java.util.List;

import com.mpbank.mpbank.domain.models.Account;

public interface LoadAccountsInterface {
  public List<Account> loadAccountByDocument(String document);

  public Account loadAccountByPhone(String phone);
}
