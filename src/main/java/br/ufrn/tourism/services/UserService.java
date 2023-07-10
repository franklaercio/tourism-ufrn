package br.ufrn.tourism.services;

import br.ufrn.tourism.database.UserDatabase;
import br.ufrn.tourism.database.entities.UserEntity;
import br.ufrn.tourism.domain.Native;
import br.ufrn.tourism.domain.Person;
import br.ufrn.tourism.domain.Tourist;
import br.ufrn.tourism.domain.UserType;
import br.ufrn.tourism.exceptions.BadRequestException;
import br.ufrn.tourism.http.data.request.CreateUserRequest;
import java.util.Objects;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  private final UserDatabase userDatabase;

  public UserService(UserDatabase userDatabase) {
    this.userDatabase = userDatabase;
  }

  public void create(CreateUserRequest request) {
    if (Objects.isNull(request.getName()) || Objects.isNull(request.getLastName())
        || Objects.isNull(request.getBirthday()) || Objects.isNull(request.getUserType())) {
      throw new BadRequestException("Invalid parameters, verify the values and try again.");
    }

    if (request.getUserType().equals(UserType.NATIVE)) {
      Native nativeUser = new Native(request.getName(), request.getLastName(),
          request.getBirthday());
      this.userDatabase.save(nativeUser, nativeUser.getUserType());
    } else if (request.getUserType().equals(UserType.TOURIST)) {
      Tourist tourist = new Tourist(request.getName(), request.getLastName(),
          request.getBirthday());
      this.userDatabase.save(tourist, tourist.getUserType());
    } else {
      throw new BadRequestException("Invalid parameters, verify the values and try again.");
    }
  }

  public Person findOne(Long userId) {
    if (Objects.isNull(userId)) {
      throw new BadRequestException("Invalid parameters, verify the values and try again.");
    }

    UserEntity userEntity = this.userDatabase.findOne(userId);

    if (userEntity.getUserType().equals(UserType.NATIVE)) {
      return new Native(userEntity.getName(), userEntity.getLastName(), userEntity.getBirthday());
    } else if (userEntity.getUserType().equals(UserType.TOURIST)) {
      return new Tourist(userEntity.getName(), userEntity.getLastName(), userEntity.getBirthday());
    } else {
      throw new BadRequestException("Invalid parameters, verify the values and try again.");
    }
  }
}
