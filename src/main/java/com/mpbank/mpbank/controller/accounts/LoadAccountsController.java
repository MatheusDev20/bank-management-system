package com.mpbank.mpbank.controller.accounts;

import com.mpbank.mpbank.domain.interfaces.LoadAccountsInterface;
import com.mpbank.mpbank.dto.accounts.AccountDTO;
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

    // Mapeando a Entidade Account para o DTO usado na reposta.
    AccountDTO dtoResponse = modelMapper.map(useCase.loadAccountByDocument(doc), AccountDTO.class);

    HttpResponse response = new HttpResponse(200, "Success!", dtoResponse);
    return ResponseEntity.ok(response);
  }

  @GetMapping("/phone")
  public ResponseEntity<HttpResponse> loadAccountByPhone(@RequestParam String phone) {
    // Mapeando a Entidade Account para o DTO usado na reposta.
    AccountDTO dtoResponse = modelMapper.map(useCase.loadAccountByPhone(phone), AccountDTO.class);

    HttpResponse response = new HttpResponse(200, "Success!", dtoResponse);
    return ResponseEntity.ok(response);
  }
}
