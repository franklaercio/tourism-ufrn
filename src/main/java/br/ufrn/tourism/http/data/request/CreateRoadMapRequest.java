package br.ufrn.tourism.http.data.request;

import br.ufrn.tourism.domain.Attraction;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.LocalDate;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRoadMapRequest {

  private String name;

  private List<Attraction> attractions;

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
