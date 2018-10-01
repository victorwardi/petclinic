package guru.springframework.petclinic.service.springdatajpa;

import guru.springframework.petclinic.model.PetType;
import guru.springframework.petclinic.repository.PetTypeRepository;
import guru.springframework.petclinic.service.PetTypeService;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Victor Wardi - @vwardi - on 27/09/2018.
 */
public class PetTypeJpaService implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeJpaService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findByName(String name) {
        return petTypeRepository.findByFirstName(name);
    }

    @Override
    public PetType findById(Long id) {
        return petTypeRepository.findById(id).orElse(null);
    }

    @Override
    public PetType save(PetType type) {
        return petTypeRepository.save(type);
    }

    @Override
    public void delete(PetType type) {
        petTypeRepository.delete(type);
    }

    @Override
    public void deleteByID(Long id) {
        petTypeRepository.deleteById(id);

    }
}
