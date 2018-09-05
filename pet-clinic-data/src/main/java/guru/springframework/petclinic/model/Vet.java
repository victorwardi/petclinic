package guru.springframework.petclinic.model;

public class Vet extends Person{

    private String[] specialities;

    public String[] getSpecialities() {
        return specialities;
    }

    public void setSpecialities(String[] specialities) {
        this.specialities = specialities;
    }
}
