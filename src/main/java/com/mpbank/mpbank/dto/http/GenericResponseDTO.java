package com.mpbank.mpbank.dto.http;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GenericResponseDTO<T> {
  public Integer statusCode;
  public String message;

  private T data;

}
