package guru.springframework.petclinic.service;

import java.util.Set;

/**
 * Created by Victor Wardi - @vwardi - on 22/08/2018.
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    T findByName(String name);

    T findById(ID id);

    T save(T object);

    void delete(T object);

    void deleteByID(ID id);


}
