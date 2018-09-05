package guru.springframework.petclinic.service.map;

import guru.springframework.petclinic.model.Owner;
import guru.springframework.petclinic.service.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Victor Wardi - @vwardi - on 22/08/2018.
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findByName(String name) {
        return null; //TODO implement this
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }


}
