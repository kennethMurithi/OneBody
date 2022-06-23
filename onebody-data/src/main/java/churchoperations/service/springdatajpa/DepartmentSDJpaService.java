package churchoperations.service.springdatajpa;

import churchoperations.model.Departments;
import churchoperations.repositories.DepartmentsRepository;
import churchoperations.service.DepartmentService;

import java.util.HashSet;
import java.util.Set;

public class DepartmentSDJpaService implements DepartmentService {

    private DepartmentsRepository departmentsRepository;

    @Override
    public Set<Departments> findAll() {
        Set<Departments> departments = new HashSet<>();
        departmentsRepository.findAll().forEach(departments::add);
        return departments;
    }

    @Override
    public Departments findById(Long aLong) {
        return departmentsRepository.findById(aLong).orElse(null);
    }

    @Override
    public Departments save(Departments object) {
        return departmentsRepository.save(object);
    }

    @Override
    public void delete(Departments object) {
        departmentsRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        departmentsRepository.deleteById(aLong);
    }
}
