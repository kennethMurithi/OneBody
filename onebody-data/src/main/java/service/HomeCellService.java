package service;

import model.HomeCellGroups;

public interface HomeCellService extends CrudService<HomeCellGroups, Long> {

    HomeCellGroups findByName(String name);

}
