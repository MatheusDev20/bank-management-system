package com.mpbank.mpbank.controller.accounts;

import java.util.Date;

import com.mpbank.mpbank.dto.accounts.EditAccountDTO;
import com.mpbank.mpbank.dto.http.GenericResponseDTO;
import com.mpbank.mpbank.usecases.accounts.EditAccountUseCase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/accounts")
@RequiredArgsConstructor
public class EditAccountController {

  @Autowired
  EditAccountUseCase useCase;

  @PutMapping
  public ResponseEntity<GenericResponseDTO<Object>> editAccount(@RequestBody EditAccountDTO<Object> editInfo) {
    useCase.editBasicAccountInfo(editInfo);

    GenericResponseDTO<Object> response = new GenericResponseDTO<Object>(
        200,
        "Edited",
        new Date(),
        null);

    return ResponseEntity.ok(response);
  }
}
