package br.ufrn.tourism.database.jpa;

import br.ufrn.tourism.database.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRespository extends CrudRepository<UserEntity, Long> {

}
