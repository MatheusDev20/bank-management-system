package com.mpbank.mpbank.dto.accounts;

import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EditAccountDTO<T> {

  @NotNull(message = "Full name is required")
  private String fullName;

  @NotNull(message = "Birth date is required")
  private Date birthDate;

  @NotNull(message = "Document date is required")
  private String document;

  @NotNull(message = "Concact Email is required")
  private String contactEmail;

  @NotNull(message = "Parent name is required")
  private String parentName;

  @NotNull(message = "Phone name is required")
  private String phone;

}
