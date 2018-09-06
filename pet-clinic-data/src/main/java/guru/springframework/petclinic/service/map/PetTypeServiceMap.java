package guru.springframework.petclinic.service.map;

import guru.springframework.petclinic.model.PetType;
import guru.springframework.petclinic.service.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Victor Wardi - @vwardi - on 06/09/2018.
 */
@Service
public class PetTypeServiceMap  extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public PetType findByName(String name) {
        return null; //TODO implement this
    }

    @Override
    public PetType findById(Long id) {
        return super.findById(id);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }
}