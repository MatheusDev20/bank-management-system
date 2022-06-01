package com.mpbank.mpbank.dto.accounts;

import java.util.Date;

import com.mpbank.mpbank.domain.models.Address;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class AccountDTO {

  private String fullName;
  private Date birthDate;
  private String contactEmail;
  private String parentName;
  private String phone;

  // public AccountDTO(String fullName, Date birthDate, String contactEmail,
  // String parentName, String phone) {
  // this.fullName = fullName;
  // this.birthDate = birthDate;
  // this.contactEmail = contactEmail;
  // this.parentName = parentName;
  // this.phone = phone;
  // }

}
