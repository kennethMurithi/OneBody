package churchoperations.repositories;

import churchoperations.model.Leaders;
import org.springframework.data.repository.CrudRepository;

public interface LeadersRepository extends CrudRepository<Leaders,Long> {
}
