package br.ufrn.tourism.services;

import br.ufrn.tourism.database.RoadMapDatabase;
import br.ufrn.tourism.database.entities.RoadMapEntity;
import br.ufrn.tourism.domain.RoadMap;
import br.ufrn.tourism.exceptions.BadRequestException;
import br.ufrn.tourism.http.data.request.CreateRoadMapRequest;
import br.ufrn.tourism.http.data.request.FollowRoadMapRequest;
import java.util.Objects;
import org.springframework.stereotype.Service;

@Service
public class RoadMapService {

  private final RoadMapDatabase roadMapDatabase;

  public RoadMapService(RoadMapDatabase roadMapDatabase) {
    this.roadMapDatabase = roadMapDatabase;
  }

  public void create(CreateRoadMapRequest request) {
    if (Objects.isNull(request.getName())) {
      throw new BadRequestException("Invalid parameters, verify the values and try again.");
    }

    this.roadMapDatabase.save(new RoadMap(request.getName(), request.getAttractions()));
  }

  public Iterable<RoadMapEntity> getAll() {
    return this.roadMapDatabase.getAll();
  }

  public RoadMap follow(FollowRoadMapRequest request) {
    if (Objects.isNull(request.getRoadMapId())) {
      throw new BadRequestException("Invalid parameters, verify the values and try again.");
    }

    return null;
  }
}
