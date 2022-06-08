package com.mpbank.mpbank.dto.accounts;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseAccountDTO {
  private String _id;
  private String fullName;

  public ResponseAccountDTO(String _id, String fullName) {
    this._id = _id;
    this.fullName = fullName;
  }
}
