package guru.springframework.petclinic.repository;

import guru.springframework.petclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Victor Wardi - @vwardi - on 25/09/2018.
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {

    PetType findByName(String name);
}
