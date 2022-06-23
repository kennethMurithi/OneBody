package churchoperations.service.map;

import churchoperations.model.Member;
import churchoperations.service.MemberService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
@Profile({"default", "map"})
public class MemberServiceMap extends AbstractMapService<Member, Long> implements MemberService {
    @Override
    public Member findByLastName(String lastName) {
        return null;
    }

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
        return super.save(object);
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
