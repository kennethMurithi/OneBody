package churchoperations.service.springdatajpa;

import churchoperations.model.Member;
import churchoperations.repositories.CounsellingRepository;
import churchoperations.repositories.DepartmentsRepository;
import churchoperations.repositories.MemberRepository;
import churchoperations.repositories.PositionRepository;
import churchoperations.service.MemberService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class MemberSDJpaService implements MemberService {

    private final MemberRepository memberRepository;
    private final PositionRepository positionRepository;
    private final DepartmentsRepository departmentsRepository;
    private final CounsellingRepository counsellingRepository;

    public MemberSDJpaService(MemberRepository memberRepository,
                              PositionRepository positionRepository, DepartmentsRepository departmentsRepository,
                              CounsellingRepository counsellingRepository) {
        this.memberRepository = memberRepository;
        this.positionRepository = positionRepository;
        this.departmentsRepository = departmentsRepository;
        this.counsellingRepository = counsellingRepository;
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
    public List<Member> findAllByLastNameLike(String lastName) {
        return null;
    }

    @Override
    public Member findById(Long aLong) {
        Optional<Member> optionalMember = Optional.ofNullable(memberRepository.findById(aLong));
        return optionalMember.orElse(null);
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
