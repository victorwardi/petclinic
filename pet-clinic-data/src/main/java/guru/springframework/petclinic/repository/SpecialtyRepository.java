package guru.springframework.petclinic.repository;

import guru.springframework.petclinic.model.Specialty;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Victor Wardi - @vwardi - on 25/09/2018.
 */
public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {
    Specialty findByFirstName(String name);
}
