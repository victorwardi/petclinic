package guru.springframework.petclinic.repository;

import guru.springframework.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Victor Wardi - @vwardi - on 25/09/2018.
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
    Pet findByFirstName(String name);
}

