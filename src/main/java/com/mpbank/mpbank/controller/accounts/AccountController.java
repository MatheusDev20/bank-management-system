package com.mpbank.mpbank.controller.accounts;

import java.util.Date;

import com.mpbank.mpbank.domain.interfaces.AddAccountInterface;
import com.mpbank.mpbank.dto.accounts.CreateAccountDto;
import com.mpbank.mpbank.dto.accounts.ResponseAccountDTO;
import com.mpbank.mpbank.dto.http.GenericResponseDTO;
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
  public ResponseEntity<GenericResponseDTO<ResponseAccountDTO>> insert(@RequestBody CreateAccountDto accountData) {
    String acc_id = addAcount.add(accountData);
    ResponseAccountDTO responseAccount = new ResponseAccountDTO(acc_id, accountData.getFullName());

    GenericResponseDTO<ResponseAccountDTO> response = new GenericResponseDTO<ResponseAccountDTO>(
        201,
        "Created!",
        new Date(),
        responseAccount);
         
    return ResponseEntity.ok(response);
  }
}
