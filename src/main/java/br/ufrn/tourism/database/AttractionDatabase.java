package br.ufrn.tourism.database;

import br.ufrn.tourism.database.entities.AttractionEntity;
import br.ufrn.tourism.database.entities.UserEntity;
import br.ufrn.tourism.database.jpa.AttractionRepository;
import br.ufrn.tourism.domain.Attraction;
import org.springframework.stereotype.Service;

@Service
public class AttractionDatabase {

  private final AttractionRepository attractionRepository;

  public AttractionDatabase(AttractionRepository attractionRepository) {
    this.attractionRepository = attractionRepository;
  }

  public void save(Attraction attraction, UserEntity userEntity) {
    AttractionEntity attractionEntity = new AttractionEntity();
    attractionEntity.setName(attraction.getName());
    attractionEntity.setDescription(attraction.getDescription());
    attractionEntity.setDate(attraction.getDate());
    attractionEntity.setLocation(attraction.getLocation());
    attractionEntity.setUserEntity(userEntity);

    this.attractionRepository.save(attractionEntity);
  }

}
