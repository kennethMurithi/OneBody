package service.map;

import model.Leaders;
import service.CrudService;

import java.util.Set;

public class LeadersServiceMap extends AbstractMapService<Leaders, Long> implements CrudService<Leaders, Long> {

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
        return super.save(object.getId(), object);
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
