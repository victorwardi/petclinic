package guru.springframework.petclinic.service;

import guru.springframework.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByName(String nam);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();

}
