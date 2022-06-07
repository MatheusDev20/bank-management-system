package com.mpbank.mpbank.controller.accounts;

import java.util.List;

import com.mpbank.mpbank.domain.interfaces.LoadAccountsInterface;
import com.mpbank.mpbank.domain.models.Account;
import com.mpbank.mpbank.dto.accounts.AccountDTO;
import com.mpbank.mpbank.dto.http.GenericResponseDTO;
import com.mpbank.mpbank.utils.Mapper;
import org.springframework.http.ResponseEntity;

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

  @Autowired
  Mapper modelMapper;

  @GetMapping
  public ResponseEntity<GenericResponseDTO<List<AccountDTO>>> loadAllAccounts() {
    List<Account> allAccounts = useCase.loadAllAccounts();
    List<AccountDTO> returnedAccounts = modelMapper.mapperAccountEntityToDto(allAccounts);

    GenericResponseDTO<List<AccountDTO>> response = new GenericResponseDTO<List<AccountDTO>>(200, "Success Fetched", returnedAccounts);
    return ResponseEntity.ok(response);

  }

  @GetMapping("/document")
  public ResponseEntity<GenericResponseDTO<List<AccountDTO>>> loadAccountByDocument(@RequestParam String doc) {

    List<Account> accounts = useCase.loadAccountByDocument(doc);
    // Mapeando a Entidade Account para o DTO usado na reposta.
    List<AccountDTO> returnedAccounts = modelMapper.mapperAccountEntityToDto(accounts);
    GenericResponseDTO<List<AccountDTO>> response = new GenericResponseDTO<List<AccountDTO>>(200, "Success Fetched", returnedAccounts);
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
