package com.mpbank.mpbank.usecases.accounts;

import java.util.List;

import com.mpbank.mpbank.domain.interfaces.EditAccountInterface;
import com.mpbank.mpbank.domain.interfaces.LoadAccountsInterface;
import com.mpbank.mpbank.domain.models.Account;
import com.mpbank.mpbank.dto.accounts.EditAccountDTO;
import com.mpbank.mpbank.repository.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class EditAccountUseCase implements EditAccountInterface {

  @Autowired
  LoadAccountsInterface loadAccount;

  @Autowired
  AccountRepository repository;

  public void editBasicAccountInfo(EditAccountDTO<Object> editInfo) {
    // Find the specifi account to be edited
    List<Account> queryResult = loadAccount.loadAccountByDocument(editInfo.getDocument());
    Account acc = queryResult.get(0);
    acc.setBirthDate(editInfo.getBirthDate());
    acc.setContactEmail(editInfo.getContactEmail());
    acc.setFullName(editInfo.getFullName());
    acc.setParentName(editInfo.getParentName());
    acc.setPhone(editInfo.getPhone());

    repository.save(acc);
  }
}
