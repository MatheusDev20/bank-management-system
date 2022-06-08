package com.mpbank.mpbank.domain.interfaces;

import com.mpbank.mpbank.dto.accounts.CreateAccountDto;

public interface AddAccountInterface {
  // Returns the _id of the current mongo document created;
  public String add(CreateAccountDto accountData);
}
