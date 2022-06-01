package com.mpbank.mpbank.controller.accounts;

import java.util.ArrayList;
import java.util.List;

import com.mpbank.mpbank.domain.interfaces.LoadAccountsInterface;
import com.mpbank.mpbank.domain.models.Account;
import com.mpbank.mpbank.dto.accounts.AccountDTO;
import com.mpbank.mpbank.http.DataResponse;
import com.mpbank.mpbank.http.HttpResponse;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

  @Autowired
  ModelMapper modelMapper;

  @GetMapping("/document")
  public ResponseEntity<HttpResponse> loadAccountByDocument(@RequestParam String doc) {

    List<AccountDTO> returnedAccounts = new ArrayList<AccountDTO>();
    // Mapeando a Entidade Account para o DTO usado na reposta.
    List<Account> accounts = useCase.loadAccountByDocument(doc);
    for (int i = 0; i < accounts.size(); i++) {
      returnedAccounts.add(modelMapper.map(accounts.get(i), AccountDTO.class));
    }
    ;
    // DataResponse<List<AccountDTO>> dtoResponse = new
    // DataResponse<List<AccountDTO>>(returnedAccounts);
    HttpResponse response = new HttpResponse(200, "Success!", returnedAccounts, returnedAccounts.size());
    return ResponseEntity.ok(response);
  }

  // @GetMapping("/phone")
  // public ResponseEntity<HttpResponse> loadAccountByPhone(@RequestParam String
  // phone) {
  // // Mapeando a Entidade Account para o DTO usado na reposta.
  // AccountDTO dtoResponse = modelMapper.map(useCase.loadAccountByPhone(phone),
  // AccountDTO.class);

  // HttpResponse response = new HttpResponse(200, "Success!", dtoResponse);
  // return ResponseEntity.ok(response);
  // }
}
