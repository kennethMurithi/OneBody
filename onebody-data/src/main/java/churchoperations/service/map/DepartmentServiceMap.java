package churchoperations.service.map;

import churchoperations.model.Departments;
import churchoperations.service.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class DepartmentServiceMap extends AbstractMapService<Departments, Long> implements DepartmentService {

    @Override
    public Set<Departments> findAll() {
        return super.findAll();
    }

    @Override
    public Departments findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Departments save(Departments object) {
        return super.save(object);
    }

    @Override
    public void delete(Departments object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
