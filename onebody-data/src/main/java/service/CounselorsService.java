package service;

import model.Counselors;

import java.util.Set;

public interface CounselorsService {

    Counselors findById(Long id);

    Counselors save(Counselors counselors);

    Set<Counselors> findAll();

}
