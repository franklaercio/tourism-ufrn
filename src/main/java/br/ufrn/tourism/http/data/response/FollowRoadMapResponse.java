package br.ufrn.tourism.http.data.response;

import br.ufrn.tourism.domain.RoadMap;
import br.ufrn.tourism.http.data.GeneralResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FollowRoadMapResponse extends GeneralResponse {

  private final RoadMap roadMap;

  public FollowRoadMapResponse(String message, RoadMap roadMap) {
    super(message);
    this.roadMap = roadMap;
  }

  public RoadMap getRoadMap() {
    return roadMap;
  }
}
