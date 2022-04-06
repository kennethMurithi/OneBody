package service.map;

import model.Position;
import service.CrudService;

import java.util.Set;

public class PositionServiceMap extends AbstractMapService<Position, Long> implements CrudService<Position, Long> {

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
        return this.save(object.getId(), object);
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
