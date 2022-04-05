package service;

import model.Leaders;

import java.util.Set;

public interface LeaderService {

    Leaders findById(Long id);

    Leaders save(Leaders leaders);

    Set<Leaders> findAll();
}
