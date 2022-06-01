package com.mpbank.mpbank.usecases.accounts;

import java.util.List;

import com.mpbank.mpbank.domain.interfaces.DeleteAccountInterface;
import com.mpbank.mpbank.domain.models.Account;
import com.mpbank.mpbank.dto.accounts.DeleteAccountDTO;
import com.mpbank.mpbank.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteAccount implements DeleteAccountInterface {

  @Autowired
  AccountRepository repository;

  public void delete(DeleteAccountDTO deleteInformation) {

    Account acc = repository.findByid(deleteInformation.getId());
    repository.delete(acc);
  }
}