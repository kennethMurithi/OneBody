package churchoperations.repositories;

import churchoperations.model.Member;
import churchoperations.service.CrudService;
import org.springframework.stereotype.Repository;

@Repository
public interface MemberRepository extends CrudService<Member, Long> {

    Member findByLastName(String lastName);
}
