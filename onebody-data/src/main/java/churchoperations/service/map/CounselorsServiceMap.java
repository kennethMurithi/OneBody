package churchoperations.service.map;

import churchoperations.model.Councilors;
import churchoperations.service.CounselorsService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class CounselorsServiceMap extends AbstractMapService<Councilors, Long> implements CounselorsService {

    @Override
    public Set<Councilors> findAll() {
        return super.findAll();
    }

    @Override
    public Councilors findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Councilors save(Councilors object) {
        return super.save(object);
    }

    @Override
    public void delete(Councilors object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
