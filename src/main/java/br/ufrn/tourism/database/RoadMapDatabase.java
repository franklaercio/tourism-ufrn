package br.ufrn.tourism.database;

import br.ufrn.tourism.database.entities.RoadMapEntity;
import br.ufrn.tourism.database.jpa.RoadMapRepository;
import br.ufrn.tourism.domain.RoadMap;
import org.springframework.stereotype.Service;

@Service
public class RoadMapDatabase {

  private final RoadMapRepository roadMapRepository;

  public RoadMapDatabase(RoadMapRepository roadMapRepository) {
    this.roadMapRepository = roadMapRepository;
  }

  public void save(RoadMap roadMap) {
    RoadMapEntity entity = new RoadMapEntity();
    entity.setName(roadMap.getName());

    this.roadMapRepository.save(entity);
  }

  public Iterable<RoadMapEntity> getAll() {
    return this.roadMapRepository.findAll();
  }

}
