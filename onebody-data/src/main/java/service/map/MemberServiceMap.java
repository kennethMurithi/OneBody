package service.map;

import model.Member;
import service.CrudService;

import java.util.Set;

public class MemberServiceMap extends AbstractMapService<Member, Long> implements CrudService<Member, Long> {

    @Override
    public Set<Member> findAll() {
        return super.findAll();
    }

    @Override
    public Member findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Member save(Member object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Member object) {
        delete(object);
    }

    @Override
    public void deleteById(Long id) {
        deleteById(id);
    }
}
