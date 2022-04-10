package churchoperations.bootstrap;

import model.HomeCellGroups;
import model.Member;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import service.HomeCellService;
import service.MemberService;
import service.map.HomeCellGroupsMap;
import service.map.MemberServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final MemberService memberService;
//    private final DepartmentService departmentService;
    private final HomeCellService homeCellService;
//    private final CounselorsService counselorsService;
//    private final LeaderService leaderService;
//    private final MissionersService missionersService;
//    private final PositionService positionService;

    public DataLoader() {
        memberService = new MemberServiceMap();
//        departmentService = new DepartmentServiceMap();
        homeCellService = new HomeCellGroupsMap();
//        counselorsService = new CounselorsServiceMap();
//        leaderService = new LeadersServiceMap();
//        missionersService = new MissionersServiceMap();
//        positionService = new PositionServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Member member1 = new Member();
        member1.setId(1L);
        member1.setFirstName("Kenneth");
        member1.setLastName("Mark");
        member1.setAddress("Nairobi");
        member1.setTelephone("09873-8276");

        memberService.save(member1);

        Member member2 = new Member();
        member2.setId(2L);
        member2.setFirstName("Evelyn");
        member2.setLastName("Loise");
        member2.setAddress("Mombasa");
        member2.setTelephone("0983-0076");

        memberService.save(member2);

        System.out.println("Loaded Members......");

        HomeCellGroups homeCellGroups1 = new HomeCellGroups();
        homeCellGroups1.setId(1L);
        homeCellGroups1.setCellName("Nairobi East");
        homeCellGroups1.setComments("First Meet was Great");

        homeCellService.save(homeCellGroups1);

        HomeCellGroups homeCellGroups2 = new HomeCellGroups();
        homeCellGroups2.setId(2L);
        homeCellGroups2.setCellName("Nairobi West");
        homeCellGroups2.setComments("We Held our Meeting Successfully");

        homeCellService.save(homeCellGroups2);

        System.out.println("Loaded HomeCellGroups......");

    }
}
