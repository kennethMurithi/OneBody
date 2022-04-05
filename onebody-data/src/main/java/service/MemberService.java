package service;

import model.Members;

import java.util.Set;

public interface MemberService {

    Members findByLastName(String lastName);

    Members findById(Long id);

    Members save(Members members);

    Set<Members> findAll();

}
