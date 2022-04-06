package service;

import model.Members;

public interface MemberService extends CrudService<Members, Long> {

    Members findByLastName(String lastName);

}
