package com.mpbank.mpbank.domain.models;

import java.util.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import com.mongodb.lang.NonNull;

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

  @NotNull
  @Min(10)
  public String fullName;

  @NotNull
  public Date birthDate;

  @NotNull
  public String document;

  @NotNull
  @Email
  public String contactEmail;

  @NotNull
  public String parentName;

  @NotNull
  @Max(11)
  public String phone;

  @NotNull
  public Address address;

  public Double balance;

  public Date createdDate;
  
  public Date updatedDate;

}