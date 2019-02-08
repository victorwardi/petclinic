package guru.springframework.petclinic.service.springdatajpa;

import guru.springframework.petclinic.model.Owner;
import guru.springframework.petclinic.repository.OwnerRepository;
import guru.springframework.petclinic.repository.PetRepository;
import guru.springframework.petclinic.repository.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

/**
 * Created by Victor Wardi - @vwardi on 04/02/2019
 **/
@ExtendWith(MockitoExtension.class)
class OwnerJpaServiceTest {

    @Mock
    OwnerRepository ownerRepository;

    @Mock
    PetRepository petRepository;

    @Mock
    PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerJpaService service;

    @BeforeEach
    void setUp() {


    }

    @Test
    void findAll() {
    }

    @Test
    void findByName() {

        Owner o = service.findByName("Victor");
    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteByID() {
    }
}