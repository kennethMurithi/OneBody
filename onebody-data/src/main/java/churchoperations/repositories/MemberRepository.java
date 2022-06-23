package churchoperations.repositories;

import churchoperations.model.Member;
import churchoperations.service.CrudService;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends CrudService<Member, Long> {

    Member findByLastName(String lastName);

    List<Member> findAllByLastNameLike(String lastName);
}
