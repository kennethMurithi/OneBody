package churchoperations.model;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Departments")
public class Departments extends BaseEntity {

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Set<Member> member;

    @Column(name = "duties")
    private String duties;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "CalenderOfEvents_id")
    private Set<CalenderOfEvents> calenderOfEvents;


    public Set<Member> getMember() {
        return member;
    }

    public void setMember(Set<Member> member) {
        this.member = member;
    }

    public String getDuties() {
        return duties;
    }

    public void setDuties(String duties) {
        this.duties = duties;
    }

    public Set<CalenderOfEvents> getCalenderOfEvents() {
        return calenderOfEvents;
    }

    public void setCalenderOfEvents(Set<CalenderOfEvents> calenderOfEvents) {
        this.calenderOfEvents = calenderOfEvents;
    }
}
