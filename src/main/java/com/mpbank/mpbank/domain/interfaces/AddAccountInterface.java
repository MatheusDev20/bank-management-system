package com.mpbank.mpbank.domain.interfaces;

import com.mpbank.mpbank.dto.accounts.CreateAccountDto;

public interface AddAccountInterface {
  public void add(CreateAccountDto accountData);
}
