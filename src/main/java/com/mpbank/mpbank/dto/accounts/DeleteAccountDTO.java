package com.mpbank.mpbank.dto.accounts;

import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
public class DeleteAccountDTO {
  private String document;
  private String contactEmail;
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
