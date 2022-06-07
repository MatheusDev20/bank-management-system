package com.mpbank.mpbank.controller.accounts;

import com.mpbank.mpbank.domain.interfaces.DeleteAccountInterface;
import com.mpbank.mpbank.dto.accounts.DeleteAccountDTO;
import com.mpbank.mpbank.dto.http.GenericResponseDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/accounts")
@RequiredArgsConstructor
public class DeleteAccountController {

  @Autowired
  DeleteAccountInterface useCase;

  @DeleteMapping
  public GenericResponseDTO<DeleteAccountDTO> deleteAccount(@RequestBody DeleteAccountDTO deleteInformation) {
    useCase.delete(deleteInformation);
    return new GenericResponseDTO<DeleteAccountDTO>(201, "Succesfully Deleted", deleteInformation);
  }
};
