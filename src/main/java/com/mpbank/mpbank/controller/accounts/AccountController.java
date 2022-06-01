package com.mpbank.mpbank.controller.accounts;

import com.mpbank.mpbank.domain.interfaces.AddAccountInterface;
import com.mpbank.mpbank.dto.accounts.CreateAccountDto;
import com.mpbank.mpbank.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

  @PostMapping
  public ResponseEntity<HttpResponse> insert(@RequestBody CreateAccountDto accountData) {
    addAcount.add(accountData);
    HttpResponse response = new HttpResponse(201, "Created!", accountData, 1);
    return ResponseEntity.ok(response);
  }
}
