package churchoperations.repositories;

import churchoperations.model.Departments;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentsRepository extends CrudRepository<Departments, Long> {
}
