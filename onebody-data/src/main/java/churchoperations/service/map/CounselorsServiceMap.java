package churchoperations.service.map;

import churchoperations.model.Counselors;
import churchoperations.service.CounselorsService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CounselorsServiceMap extends AbstractMapService<Counselors, Long> implements CounselorsService {

    @Override
    public Set<Counselors> findAll() {
        return super.findAll();
    }

    @Override
    public Counselors findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Counselors save(Counselors object) {
        return super.save(object);
    }

    @Override
    public void delete(Counselors object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
