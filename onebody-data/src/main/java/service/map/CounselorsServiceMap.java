package service.map;

import model.Counselors;
import service.CrudService;

import java.util.Set;

public class CounselorsServiceMap extends AbstractMapService<Counselors, Long> implements CrudService<Counselors, Long> {

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
        return super.save(object.getId(), object);
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
