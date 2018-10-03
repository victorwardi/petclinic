package guru.springframework.petclinic.service.springdatajpa;

import guru.springframework.petclinic.model.Specialty;
import guru.springframework.petclinic.repository.SpecialtyRepository;
import guru.springframework.petclinic.service.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Victor Wardi - @vwardi - on 28/09/2018.
 */
@Service
@Profile("springdatajpa")
public class SpecialtyJpaService implements SpecialtyService {

    private final SpecialtyRepository specialtyRepository;

    public SpecialtyJpaService(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }

    @Override
    public Set<Specialty> findAll() {
        Set<Specialty> specialties = new HashSet<>();
        specialtyRepository.findAll().forEach(specialties::add);
        return specialties;
    }

    @Override
    public Specialty findByName(String name) {
      return  specialtyRepository.findByDescription(name);
    }

    @Override
    public Specialty findById(Long id) {
        return specialtyRepository.findById(id).orElse(null);
    }

    @Override
    public Specialty save(Specialty specialty) {
        return specialtyRepository.save(specialty);
    }

    @Override
    public void delete(Specialty specialty) {
        specialtyRepository.delete(specialty);
    }

    @Override
    public void deleteByID(Long id) {
        specialtyRepository.deleteById(id);
    }
}
