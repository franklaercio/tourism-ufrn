package br.ufrn.tourism.exceptions;

public class InternalServerErrorException extends RuntimeException {

  public InternalServerErrorException(String message) {
    super(message);
  }

}
