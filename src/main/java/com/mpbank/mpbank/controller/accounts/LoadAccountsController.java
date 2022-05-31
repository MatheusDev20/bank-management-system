package com.mpbank.mpbank.controller.accounts;

import com.mpbank.mpbank.domain.interfaces.LoadAccountsInterface;
import com.mpbank.mpbank.domain.models.Account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/accounts")
@RequiredArgsConstructor

public class LoadAccountsController {

  @Autowired
  LoadAccountsInterface useCase;

  @GetMapping
  public Account loadAccountByDocument(@RequestParam String document) {
    Account acc = useCase.loadAccountByDocument(document);
    return acc;
  }
}
