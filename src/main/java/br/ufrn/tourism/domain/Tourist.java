package br.ufrn.tourism.domain;

import java.time.LocalDate;

public class Tourist extends Person {

  private final UserType userType;

  public Tourist(String name, String lastName, LocalDate birthday) {
    super(name, lastName, birthday);
    userType = UserType.TOURIST;
  }

  public UserType getUserType() {
    return userType;
  }

}
