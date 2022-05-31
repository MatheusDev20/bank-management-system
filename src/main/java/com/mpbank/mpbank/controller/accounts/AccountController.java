package com.mpbank.mpbank.controller.accounts;

import com.mpbank.mpbank.domain.interfaces.AddAccountInterface;
import com.mpbank.mpbank.domain.models.Account;
import com.mpbank.mpbank.repository.AccountRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

  @Autowired
  AddAccountInterface addAcount;

  @PostMapping
  public String insert(@RequestBody Account accountData) {
    addAcount.add(accountData);
    return "Conta Salva";
  }
}
