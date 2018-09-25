package guru.springframework.petclinic.model;

import javax.persistence.Entity;

/**
 * Created by Victor Wardi - @vwardi - on 06/09/2018.
 */
@Entity
public class Specialty extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
