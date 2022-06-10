package com.mpbank.mpbank.dto.accounts;

import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

import lombok.Getter;

@Getter
@Setter
public class DeleteAccountDTO {

  @NotNull(message = "document is required")
  private String document;

  @NotNull(message = "email is required")
  @Email(message = "Not a valid email")
  private String contactEmail;

  @NotNull(message = "account id is required")
  private String id;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDocument() {
    return document;
  }

  public void setDocument(String document) {
    this.document = document;
  }

  public String getContactEmail() {
    return contactEmail;
  }

  public void setContactEmail(String contactEmail) {
    this.contactEmail = contactEmail;
  }

}
