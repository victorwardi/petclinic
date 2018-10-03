package guru.springframework.petclinic.bootstrap;

import guru.springframework.petclinic.model.*;
import guru.springframework.petclinic.service.OwnerService;
import guru.springframework.petclinic.service.PetTypeService;
import guru.springframework.petclinic.service.SpecialtyService;
import guru.springframework.petclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Victor Wardi - @vwardi - on 29/08/2018.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    private final VetService vetService;

    private final PetTypeService petTypeService;

    private final SpecialtyService specialtyService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialtyService specialtyService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialtyService = specialtyService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();

        if (count == 0) {
            loadData();
        }


    }

    private void loadData() {
        //Adding pet tyoes
        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);

        PetType dog = new PetType();
        cat.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType bird = new PetType();
        cat.setName("Bird");
        PetType savedBirdPetType = petTypeService.save(bird);

        //Adding owners and pets
        Owner owner1 = new Owner();
        owner1.setFirstName("Victor");
        owner1.setLastName("Wardi");
        owner1.setAddress("30 Sao Domingos");
        owner1.setCity("Niteroi");
        owner1.setTelephone("22665566");

        Pet owner1Pet = new Pet();
        owner1Pet.setPetType(savedDogPetType);
        owner1Pet.setOwner(owner1);
        owner1Pet.setName("Brad");
        owner1Pet.setBirthDate(LocalDate.now());
        owner1.getPets().add(owner1Pet);

        this.ownerService.save(owner1);


        Owner owner2 =  Owner.ownerBuilder().firstName("Ursula").lastName("Viviani").build();
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

        //Adding Vets and Specialties

        Vet vet1 = new Vet();
        vet1.setFirstName("Georhhia");
        vet1.setLastName("Preuss");

        Specialty radiology = new Specialty();
        radiology.setDescription("Radiology");
        Specialty savedRadiology = specialtyService.save(radiology);

        Specialty dentistry = new Specialty();
        dentistry.setDescription("Dentistry");
        Specialty savedDentistry = specialtyService.save(dentistry);

        Specialty nutrition = new Specialty();
        nutrition.setDescription("Nutrition");

        Specialty savedNutrition = specialtyService.save(nutrition);

        Set<Specialty> vet1Specialties = new HashSet<>();
        vet1Specialties.add(savedNutrition);
        vet1Specialties.add(savedDentistry);

        vet1.setSpecialities(vet1Specialties);

        this.vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Leda");
        vet2.setLastName("Paes");

        Set<Specialty> vet2Specialties = new HashSet<>();
        vet2Specialties.add(savedRadiology);
        vet2Specialties.add(savedNutrition);
        vet2Specialties.add(savedDentistry);

        vet2.setSpecialities(vet2Specialties);

        this.vetService.save(vet2);

        System.out.println("Loaded Vets...");
    }
}
