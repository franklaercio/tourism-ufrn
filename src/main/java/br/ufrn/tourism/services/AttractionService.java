package br.ufrn.tourism.services;

import br.ufrn.tourism.database.AttractionDatabase;
import br.ufrn.tourism.database.UserDatabase;
import br.ufrn.tourism.database.entities.UserEntity;
import br.ufrn.tourism.domain.Attraction;
import br.ufrn.tourism.domain.Person;
import br.ufrn.tourism.domain.UserType;
import br.ufrn.tourism.exceptions.BadRequestException;
import br.ufrn.tourism.http.data.request.CreateAttractionRequest;
import java.util.Objects;
import org.springframework.stereotype.Service;

@Service
public class AttractionService {

  private final AttractionDatabase attractionDatabase;

  private final UserDatabase userDatabase;

  public AttractionService(AttractionDatabase attractionDatabase, UserDatabase userDatabase) {
    this.attractionDatabase = attractionDatabase;
    this.userDatabase = userDatabase;
  }

  public void create(CreateAttractionRequest request) {
    if (Objects.isNull(request.getName()) || Objects.isNull(request.getDescription())
        || Objects.isNull(request.getDate()) || Objects.isNull(request.getLocation())) {
      throw new BadRequestException("Invalid parameters, verify the values and try again.");
    }

    Attraction attraction = new Attraction(request.getName(), request.getDescription(),
        request.getDate(), request.getLocation());

    UserEntity userEntity = this.userDatabase.findOne(request.getPersonId());

    if (!userEntity.getUserType().equals(UserType.NATIVE)) {
      throw new BadRequestException("Only natives can create attractions.");
    }

    this.attractionDatabase.save(attraction, userEntity);
  }
}
