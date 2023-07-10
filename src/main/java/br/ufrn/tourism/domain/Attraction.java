package br.ufrn.tourism.domain;

import java.time.LocalDate;

public class Attraction {

  private Integer id;

  private String name;

  private String description;

  private LocalDate date;

  private String location;

  public Attraction(String name, String description, LocalDate date, String location) {
    this.name = name;
    this.description = description;
    this.date = date;
    this.location = location;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }
}
