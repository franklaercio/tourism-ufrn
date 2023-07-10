package br.ufrn.tourism.domain;

import java.util.List;

public class RoadMap {

  private Integer id;

  private String name;

  private List<Attraction> attractions;

  public RoadMap(String name, List<Attraction> attractions) {
    this.name = name;
    this.attractions = attractions;
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

  public List<Attraction> getAttractions() {
    return attractions;
  }

  public void setAttractions(List<Attraction> attractions) {
    this.attractions = attractions;
  }
}
