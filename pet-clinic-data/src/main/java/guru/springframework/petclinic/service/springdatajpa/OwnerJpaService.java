package guru.springframework.petclinic.service.springdatajpa;

import guru.springframework.petclinic.model.Owner;
import guru.springframework.petclinic.repository.OwnerRepository;
import guru.springframework.petclinic.repository.PetRepository;
import guru.springframework.petclinic.repository.PetTypeRepository;
import guru.springframework.petclinic.service.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Victor Wardi - @vwardi - on 25/09/2018.
 */
@Service
@Profile("springdatajpa")
public class OwnerJpaService implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerJpaService(OwnerRepository ownerRepository, PetRepository petRepository, PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findByName(String name) {
        return ownerRepository.findByFirstName(name);
    }

    @Override
    public Owner findById(Long id) {
        return  ownerRepository.findById(id).orElse(null);
    }

    @Override
    public Owner save(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public void delete(Owner owner) {
        ownerRepository.delete(owner);
    }

    @Override
    public void deleteByID(Long id) {
        ownerRepository.deleteById(id);

    }
}
