package guru.springframework.petclinic.repository;

import guru.springframework.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Victor Wardi - @vwardi - on 25/09/2018.
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
