package com.mpbank.mpbank.http;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HttpResponse {

  private Integer statusCode;
  private String message;
  private Object data; // A List of any object
  private Integer numberOfResults;

  public HttpResponse(
      Integer statusCode,
      String message,
      Object data,
      Integer numberOfResults) {
    this.statusCode = statusCode;
    this.message = message;
    this.data = data;
    this.numberOfResults = numberOfResults;
  }
}
