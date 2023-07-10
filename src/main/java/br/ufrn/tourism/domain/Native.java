package br.ufrn.tourism.domain;

import java.time.LocalDate;

public class Native extends Person {

  private Long id;

  private final UserType userType;

  public Native() {
    userType = UserType.NATIVE;
  }

  public Native(String name, String lastName, LocalDate birthday) {
    super(name, lastName, birthday);
    userType = UserType.NATIVE;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UserType getUserType() {
    return userType;
  }
}
