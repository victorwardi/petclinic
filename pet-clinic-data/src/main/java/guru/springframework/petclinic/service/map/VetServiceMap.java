package guru.springframework.petclinic.service.map;

import guru.springframework.petclinic.model.Specialty;
import guru.springframework.petclinic.model.Vet;
import guru.springframework.petclinic.service.SpecialtyService;
import guru.springframework.petclinic.service.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Victor Wardi - @vwardi - on 22/08/2018.
 */
@Service
@Profile({"default", "map"})
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

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
    public Vet save(Vet vet) {

        if (vet.getSpecialities().size() > 0) {

            vet.getSpecialities().forEach(specialty -> {
                if (specialty.getId() == null) {
                    Specialty savedSpecilty =  this.specialtyService.save(specialty);
                    specialty.setId(savedSpecilty.getId());
                }
            });

        }

        return super.save(vet);


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
