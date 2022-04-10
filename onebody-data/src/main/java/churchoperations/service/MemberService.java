package churchoperations.service;

import churchoperations.model.Member;

public interface MemberService extends CrudService<Member, Long> {

    Member findByLastName(String lastName);

}
