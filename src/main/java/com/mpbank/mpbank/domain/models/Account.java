package com.mpbank.mpbank.domain.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Account {
  @Id
  public String id;

  public String fullName;

  public Date birthDate;

  public String document;

  public String contactEmail;

  public String parentName;

  public String phone;
  
  public Address address;

  public String detailedAccount() {
    return String.format("Account Belongs to - fullName='%s'", fullName);
  }

}