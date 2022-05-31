package com.mpbank.mpbank.dto.accounts;

import java.util.Date;
import com.mpbank.mpbank.domain.models.Address;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateAccountDto {

  private String fullName;
  private Date birthDate;
  private String document;
  private String contactEmail;
  private String parentName;
  private Address address;

}
