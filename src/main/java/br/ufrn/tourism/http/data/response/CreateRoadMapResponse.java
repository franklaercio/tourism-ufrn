package br.ufrn.tourism.http.data.response;

import br.ufrn.tourism.http.data.GeneralResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateRoadMapResponse extends GeneralResponse {

  private final Integer id;

  public CreateRoadMapResponse(String message, Integer id) {
    super(message);
    this.id = id;
  }

  public Integer getId() {
    return id;
  }

}
