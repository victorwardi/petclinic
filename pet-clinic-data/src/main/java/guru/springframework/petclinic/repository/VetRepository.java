package guru.springframework.petclinic.repository;

import guru.springframework.petclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Victor Wardi - @vwardi - on 25/09/2018.
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
