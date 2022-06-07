package com.mpbank.mpbank.dto.accounts;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EditAccountDTO<T> {

  private String fullName;
  private Date birthDate;
  private String document;
  private String contactEmail;
  private String parentName;
  private String phone;

}
