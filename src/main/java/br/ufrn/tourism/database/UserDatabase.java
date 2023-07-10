package br.ufrn.tourism.database;

import br.ufrn.tourism.database.entities.UserEntity;
import br.ufrn.tourism.database.jpa.UserRespository;
import br.ufrn.tourism.domain.Person;
import br.ufrn.tourism.domain.UserType;
import br.ufrn.tourism.exceptions.NotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDatabase {

  private final UserRespository userRespository;

  public UserDatabase(UserRespository userRespository) {
    this.userRespository = userRespository;
  }

  public void save(Person person, UserType userType) {
    UserEntity userEntity = new UserEntity();
    userEntity.setName(person.getName());
    userEntity.setLastName(person.getLastName());
    userEntity.setBirthday(person.getBirthday());
    userEntity.setUserType(userType);

    this.userRespository.save(userEntity);
  }

  public UserEntity findOne(Long id) {
    return this.userRespository.findById(id)
        .orElseThrow(() -> new NotFoundException("User not found"));
  }
}
