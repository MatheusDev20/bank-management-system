package com.mpbank.mpbank.controller.accounts;

import com.mpbank.mpbank.domain.interfaces.AddAccountInterface;
import com.mpbank.mpbank.domain.models.Account;
import com.mpbank.mpbank.dto.accounts.CreateAccountDto;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/accounts")
@RequiredArgsConstructor
public class AccountController {

  @Autowired
  private AddAccountInterface addAcount;

  @Autowired
  private ModelMapper modelMapper;

  @PostMapping
  public String insert(@RequestBody CreateAccountDto accountData) {
    Account acc = modelMapper.map(accountData, Account.class);
    addAcount.add(acc);
    return "Conta Salva";
  }
}
