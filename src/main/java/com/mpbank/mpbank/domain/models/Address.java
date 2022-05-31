package com.mpbank.mpbank.domain.models;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Address {
  
  public String streetName;

  public String zipCode;

  public String city;

  public Integer houseNumber;

  public String state;
}
