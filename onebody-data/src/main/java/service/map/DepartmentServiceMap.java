package service.map;

import model.Depertment;
import service.DepartmentService;

import java.util.Set;

public class DepartmentServiceMap extends AbstractMapService<Depertment, Long> implements DepartmentService {

    @Override
    public Set<Depertment> findAll() {
        return super.findAll();
    }

    @Override
    public Depertment findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Depertment save(Depertment object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Depertment object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
