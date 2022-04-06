package service.map;

import model.Missioners;
import service.CrudService;

import java.util.Set;

public class MissionersServiceMap extends AbstractMapService<Missioners, Long> implements CrudService<Missioners, Long> {

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
        return super.save(object.getId(), object);
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
