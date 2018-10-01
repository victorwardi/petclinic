package guru.springframework.petclinic.repository;

import guru.springframework.petclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Victor Wardi - @vwardi - on 25/09/2018.
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {

    Visit findByDescription(String description);
}
