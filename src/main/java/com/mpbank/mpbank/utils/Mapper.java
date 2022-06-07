package com.mpbank.mpbank.utils;

import java.util.ArrayList;
import java.util.List;

import com.mpbank.mpbank.domain.models.Account;
import com.mpbank.mpbank.dto.accounts.AccountDTO;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Mapper {

  @Autowired
  ModelMapper modelMapper;

  public List<AccountDTO> mapperAccountEntityToDto(List<Account> entityList) {
    List<AccountDTO> returnedAccounts = new ArrayList<AccountDTO>();
    for (int i = 0; i < entityList.size(); i++) {
      returnedAccounts.add(modelMapper.map(entityList.get(i), AccountDTO.class));
    }

    return returnedAccounts;
  }
}
