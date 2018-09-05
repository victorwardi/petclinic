package guru.springframework.petclinic.bootstrap;

import guru.springframework.petclinic.model.Owner;
import guru.springframework.petclinic.model.Vet;
import guru.springframework.petclinic.service.OwnerService;
import guru.springframework.petclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Victor Wardi - @vwardi - on 29/08/2018.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Victor");
        owner1.setLastName("Wardi");

        this.ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Ursula");
        owner2.setLastName("Viviani");
        this.ownerService.save(owner2);

        Owner owner3 = new Owner();
        owner3.setFirstName("Anderson");
        owner3.setLastName("Teixeira");

        this.ownerService.save(owner3);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Georhhia");
        vet1.setLastName("Preuss");
        vet1.setSpecialities(new String[]{"Fishes", "Turtles"});

        this.vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Leda");
        vet2.setLastName("Paes");
        vet2.setSpecialities(new String[]{"Dogs", "Cats"});

        this.vetService.save(vet2);

        System.out.println("Loaded Vets...");


    }
}
