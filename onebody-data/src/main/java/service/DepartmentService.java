package service;

import model.Depertment;

import java.util.Set;

public interface DepartmentService {

    Depertment findById(Long id);

    Depertment save(Depertment depertment);

    Set<Depertment> findAll();

}
