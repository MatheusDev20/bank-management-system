package com.mpbank.mpbank.domain.interfaces;

import com.mpbank.mpbank.domain.models.Account;

public interface LoadAccountsInterface {
  public Account loadAccountByDocument(String document);
}
