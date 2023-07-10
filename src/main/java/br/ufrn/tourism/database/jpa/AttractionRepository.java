package br.ufrn.tourism.database.jpa;

import br.ufrn.tourism.database.entities.AttractionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttractionRepository extends CrudRepository<AttractionEntity, Long> {

}
