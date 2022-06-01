package com.mpbank.mpbank.http;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataResponse<T> {
  private T collection;

  public DataResponse(T collection) {
    this.collection = collection;
  }

}
