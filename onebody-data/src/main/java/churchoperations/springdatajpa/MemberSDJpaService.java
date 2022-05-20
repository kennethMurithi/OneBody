package churchoperations.springdatajpa;

import churchoperations.model.Member;
import churchoperations.repositories.CouncilorVisitsRepository;
import churchoperations.repositories.DepartmentsRepository;
import churchoperations.repositories.MemberRepository;
import churchoperations.repositories.PositionRepository;
import churchoperations.service.MemberService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class MemberSDJpaService implements MemberService {

    private final MemberRepository memberRepository;
    private final PositionRepository positionRepository;
    private final DepartmentsRepository departmentsRepository;
    private final CouncilorVisitsRepository councilorVisitsRepository;

    public MemberSDJpaService(MemberRepository memberRepository,
                              PositionRepository positionRepository, DepartmentsRepository departmentsRepository,
                              CouncilorVisitsRepository councilorVisitsRepository) {
        this.memberRepository = memberRepository;
        this.positionRepository = positionRepository;
        this.departmentsRepository = departmentsRepository;
        this.councilorVisitsRepository = councilorVisitsRepository;
    }

    @Override
    public Member findByLastName(String lastName) {
        return memberRepository.findByLastName(lastName);
    }

    @Override
    public Set<Member> findAll() {
        Set<Member> members = new HashSet<>();
        memberRepository.findAll().forEach(members::add);
        return members;
    }

    @Override
    public Member findById(Long aLong) {
        return memberRepository.findById(aLong);
    }

    @Override
    public Member save(Member object) {
        return memberRepository.save(object);
    }

    @Override
    public void delete(Member object) {
        memberRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        memberRepository.deleteById(aLong);
    }
}
