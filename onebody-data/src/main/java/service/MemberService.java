package service;

import model.Member;

public interface MemberService extends CrudService<Member, Long> {

    Member findByLastName(String lastName);

}
