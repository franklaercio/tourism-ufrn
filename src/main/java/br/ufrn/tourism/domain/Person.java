package br.ufrn.tourism.domain;

import java.time.LocalDate;

public abstract class Person {

  private String name;

  private String lastName;

  private LocalDate birthday;

  public Person() {
  }

  public Person(String name, String lastName, LocalDate birthday) {
    this.name = name;
    this.lastName = lastName;
    this.birthday = birthday;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public LocalDate getBirthday() {
    return birthday;
  }

  public void setBirthday(LocalDate birthday) {
    this.birthday = birthday;
  }
}
