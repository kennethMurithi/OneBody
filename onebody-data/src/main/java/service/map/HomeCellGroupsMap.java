package service.map;

import model.HomeCellGroups;
import service.HomeCellService;

import java.util.Set;

public class HomeCellGroupsMap extends AbstractMapService<HomeCellGroups, Long> implements HomeCellService {

    @Override
    public HomeCellGroups findByName(String name) {
        return null;
    }

    @Override
    public Set<HomeCellGroups> findAll() {
        return super.findAll();
    }

    @Override
    public HomeCellGroups findById(Long id) {
        return super.findById(id);
    }

    @Override
    public HomeCellGroups save(HomeCellGroups object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(HomeCellGroups object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
