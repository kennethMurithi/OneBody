package service;

import model.HomeCellGroups;

import java.util.Set;

public interface HomeCellService {

    HomeCellGroups findByName(String name);

    HomeCellGroups findById(Long id);

    HomeCellGroups save(HomeCellGroups homeCellGroups);

    Set<HomeCellGroups> findAll();
}
