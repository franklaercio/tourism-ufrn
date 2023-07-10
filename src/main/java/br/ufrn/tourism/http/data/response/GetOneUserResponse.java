package br.ufrn.tourism.http.data.response;

import br.ufrn.tourism.domain.Person;
import br.ufrn.tourism.http.data.GeneralResponse;

public class GetOneUserResponse extends GeneralResponse {

  private final Person person;

  public GetOneUserResponse(String message, Person person) {
    super(message);
    this.person = person;
  }

  public Person getPerson() {
    return person;
  }
}
