package guru.springframework.petclinic.service.map;

import guru.springframework.petclinic.model.Owner;
import guru.springframework.petclinic.service.OwnerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Created by Victor Wardi - @vwardi on 04/02/2019
 **/
class OwnerServiceMapTest {

    OwnerService ownerService;

    final Long ownerID  = 1L;

    @BeforeEach
    void setUp() {
     ownerService = new OwnerServiceMap( new PetTypeServiceMap(), new PetServiceMap());
     ownerService.save(Owner.ownerBuilder().id(1L).firstName("Victor").build());

    }

    @Test
    void findAll() {

        Set<Owner> all = ownerService.findAll();

        assertEquals(1, all);
    }

    @Test
    void findByName() {

        Owner victor = ownerService.findByName("Victor");

        assertNotNull(victor);

        assertEquals(ownerID, victor.getId());


    }

    @Test
    void findById() {

        Owner o = ownerService.findById(ownerID);

        assertEquals(ownerID, o.getId());
    }

    @Test
    void save() {

        Long id = 2L;
        Owner o2 = Owner.ownerBuilder().id(id).build();

       Owner saved = ownerService.save(o2);

       assertNotNull(saved);

       assertEquals(id, saved.getId());

    }

    @Test
    void delete() {

        int onwerListBeforeDelete = ownerService.findAll().size();

        ownerService.delete(ownerService.findById(ownerID));

        int onwerListAfterDelete = ownerService.findAll().size();

        assertEquals(onwerListAfterDelete, onwerListBeforeDelete - 1 );
    }

    @Test
    void deleteByID() {

        ownerService.deleteByID(ownerID);

      assertEquals(0, ownerService.findAll().size());

    }
}