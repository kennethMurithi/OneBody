package churchoperations.service.map;

import churchoperations.model.Leaders;
import churchoperations.service.LeaderService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class LeadersServiceMap extends AbstractMapService<Leaders, Long> implements LeaderService {

    @Override
    public Set<Leaders> findAll() {
        return super.findAll();
    }

    @Override
    public Leaders findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Leaders save(Leaders object) {
        return super.save(object);
    }

    @Override
    public void delete(Leaders object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
