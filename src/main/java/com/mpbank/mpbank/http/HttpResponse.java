package com.mpbank.mpbank.http;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HttpResponse {

  private Integer statusCode;
  private String message;
  private Object data;

  public HttpResponse(Integer statusCode, String message, Object data) {
    this.statusCode = statusCode;
    this.message = message;
    this.data = data;
  }
}
