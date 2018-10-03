package guru.springframework.petclinic.model;

import lombok.*;

import javax.persistence.Entity;

/**
 * Created by Victor Wardi - @vwardi - on 06/09/2018.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Specialty extends BaseEntity {

    private String description;

}
