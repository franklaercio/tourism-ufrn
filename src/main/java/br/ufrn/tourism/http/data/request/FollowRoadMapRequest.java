package br.ufrn.tourism.http.data.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FollowRoadMapRequest {

  @JsonProperty("road_map_id")
  private Long roadMapId;

  public Long getRoadMapId() {
    return roadMapId;
  }

  public void setRoadMapId(Long roadMapId) {
    this.roadMapId = roadMapId;
  }
}
