package service;

import model.Missioners;

import java.util.Set;

public interface MissionersService {

    Missioners findById(Long id);

    Missioners save(Missioners missioners);

    Set<Missioners> findAll();

}
