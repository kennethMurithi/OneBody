package churchoperations.model;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "CouncilorVisits")
public class CouncilorVisits extends BaseEntity{

    @ManyToOne
    @JoinColumn(name = "councilor_id")
    private Councilors councilors;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Councilors getCouncilors() {
        return councilors;
    }

    public void setCouncilors(Councilors councilors) {
        this.councilors = councilors;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
