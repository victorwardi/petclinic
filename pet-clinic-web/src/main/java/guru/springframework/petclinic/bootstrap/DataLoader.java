package guru.springframework.petclinic.bootstrap;

import guru.springframework.petclinic.model.Owner;
import guru.springframework.petclinic.model.Pet;
import guru.springframework.petclinic.model.PetType;
import guru.springframework.petclinic.model.Vet;
import guru.springframework.petclinic.service.OwnerService;
import guru.springframework.petclinic.service.PetTypeService;
import guru.springframework.petclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Created by Victor Wardi - @vwardi - on 29/08/2018.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    private final VetService vetService;

    private final PetTypeService petTypeService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        PetType dog = new PetType();
        cat.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType bird = new PetType();
        cat.setName("Bird");
        PetType savedBirdPetType = petTypeService.save(bird);

        Owner owner1 = new Owner();
        owner1.setFirstName("Victor");
        owner1.setLastName("Wardi");
        owner1.setAddresss("30 Sao Domingos");
        owner1.setCity("Niteroi");
        owner1.setTelephone("22665566");

        Pet owner1Pet = new Pet();
        owner1Pet.setPetType(savedDogPetType);
        owner1Pet.setOwner(owner1);
        owner1Pet.setName("Brad");
        owner1Pet.setBirthDate(LocalDate.now());
        owner1.getPets().add(owner1Pet);

        this.ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Ursula");
        owner2.setLastName("Viviani");
        this.ownerService.save(owner2);

        Pet owner2Pet = new Pet();
        owner2Pet.setPetType(savedCatPetType);
        owner2Pet.setOwner(owner1);
        owner2Pet.setName("Belinha");
        owner2Pet.setBirthDate(LocalDate.now());
        owner2.getPets().add(owner2Pet);

        Owner owner3 = new Owner();
        owner3.setFirstName("Anderson");
        owner3.setLastName("Teixeira");

        Pet owner3Pet = new Pet();
        owner3Pet.setPetType(savedBirdPetType);
        owner3Pet.setOwner(owner1);
        owner3Pet.setName("Louro Jose");
        owner3Pet.setBirthDate(LocalDate.now());
        owner3.getPets().add(owner3Pet);

        this.ownerService.save(owner3);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Georhhia");
        vet1.setLastName("Preuss");

        //vet1.setSpecialities();

        this.vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Leda");
        vet2.setLastName("Paes");
       // vet2.setSpecialities();

        this.vetService.save(vet2);

        System.out.println("Loaded Vets...");


    }
}
