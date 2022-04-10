package churchoperations.service;

import churchoperations.model.HomeCellGroups;

public interface HomeCellService extends CrudService<HomeCellGroups, Long> {

    HomeCellGroups findByName(String name);

}
