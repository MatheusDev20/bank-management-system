package com.mpbank.mpbank.dto.http;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GenericResponseDTO<T> {
  public Integer statusCode;
  public String message;
  public Date timeStamp;

  private T data;

}
