package com.mpbank.mpbank.controller.accounts;

import java.util.Date;

import javax.validation.Valid;

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
  public GenericResponseDTO<String> deleteAccount( @Valid @RequestBody DeleteAccountDTO deleteInformation) {
    useCase.delete(deleteInformation);

    return new GenericResponseDTO<String>(201,
        "Succesfully Deleted",
        new Date(),
        deleteInformation.getId());
  }
};
