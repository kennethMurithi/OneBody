package churchoperations.service;

import churchoperations.model.Member;

import java.util.List;

public interface MemberService extends CrudService<Member, Long> {

    Member findByLastName(String lastName);

    List<Member> findAllByLastNameLike(String lastName);
}
