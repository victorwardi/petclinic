package guru.springframework.petclinic.service.map;

import guru.springframework.petclinic.model.Visit;
import guru.springframework.petclinic.service.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Victor Wardi - @vwardi - on 01/10/2018.
 */
@Service
public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    private final VisitService visitService;

    public VisitMapService(VisitService visitService) {
        this.visitService = visitService;
    }

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findByName(String name) {
        return null; //TODO
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit visit) {
        return super.save(visit);
    }

    @Override
    public void delete(Visit visit) {

        super.delete(visit);

    }

    @Override
    public void deleteByID(Long id) {
super.deleteById(id);
    }
}
