package br.ufrn.tourism.database.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ROADMAP")
public class RoadMapEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "roadmap_generator")
  @SequenceGenerator(name = "roadmap_generator", sequenceName = "roadmap_seq", allocationSize = 1)
  private Long id;

  @Column(name = "NAME")
  private String name;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
