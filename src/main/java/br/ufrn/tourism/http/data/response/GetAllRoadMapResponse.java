package br.ufrn.tourism.http.data.response;

import br.ufrn.tourism.database.entities.RoadMapEntity;
import br.ufrn.tourism.http.data.GeneralResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GetAllRoadMapResponse extends GeneralResponse {

  private final Iterable<RoadMapEntity> roadMapList;

  public GetAllRoadMapResponse(String message, Iterable<RoadMapEntity> roadMapList) {
    super(message);
    this.roadMapList = roadMapList;
  }

  public Iterable<RoadMapEntity> getRoadMapList() {
    return roadMapList;
  }
}
