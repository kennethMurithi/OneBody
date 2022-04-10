package churchoperations.service.map;

import churchoperations.model.Missioners;
import churchoperations.service.MissionersService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class MissionersServiceMap extends AbstractMapService<Missioners, Long> implements MissionersService {

    @Override
    public Set<Missioners> findAll() {
        return super.findAll();
    }

    @Override
    public Missioners findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Missioners save(Missioners object) {
        return super.save(object);
    }

    @Override
    public void delete(Missioners object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
