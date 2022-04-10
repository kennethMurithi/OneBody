package churchoperations.service.map;

import churchoperations.model.Position;
import churchoperations.service.PositionService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PositionServiceMap extends AbstractMapService<Position, Long> implements PositionService {

    @Override
    public Set<Position> findAll() {
        return super.findAll();
    }

    @Override
    public Position findById(Long id) {
        return this.findById(id);
    }

    @Override
    public Position save(Position object) {
        return this.save(object);
    }

    @Override
    public void delete(Position object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
