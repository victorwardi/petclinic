package guru.springframework.petclinic.bootstrap;

import guru.springframework.petclinic.model.Owner;
import guru.springframework.petclinic.model.Vet;
import guru.springframework.petclinic.service.OwnerService;
import guru.springframework.petclinic.service.VetService;
import guru.springframework.petclinic.service.map.OwnerServiceMap;
import guru.springframework.petclinic.service.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by Victor Wardi - @vwardi - on 29/08/2018.
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;

    private final VetService vetService;

    public DataLoader() {
        this.ownerService = new OwnerServiceMap();
        this.vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Victor");
        owner1.setLastName("Wardi");

        this.ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Ursula");
        owner2.setLastName("Wardi");

        this.ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Georhhia");
        vet1.setLastName("Preuss");

        this.vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Leda");
        vet2.setLastName("Paes");

        this.vetService.save(vet2);

        System.out.println("Loaded Vets...");


    }
}
