package guru.springframework.petclinic.service.map;

import guru.springframework.petclinic.model.Vet;
import guru.springframework.petclinic.service.VetService;

import java.util.Set;

/**
 * Created by Victor Wardi - @vwardi - on 22/08/2018.
 */
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findByName(String name) {
        return null; //TODO implement this
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }
}
