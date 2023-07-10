package br.ufrn.tourism.database.jpa;

import br.ufrn.tourism.database.entities.RoadMapEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoadMapRepository extends CrudRepository<RoadMapEntity, Long> {

}
