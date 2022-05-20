package churchoperations.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name ="HomeCellGroups")
public class HomeCellGroups extends BaseEntity{

    @Column(name = "Cell_Name")
    private String cellName;

    @Column(name = "cell_Leader")
    private Leaders cellLeader;

    @Column(name = "meet_date")
    private LocalDate meetDate;

    @Column(name = "comments")
    private String comments;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pastoralvisit_id")
    private Set<PastoralVisit> pastoralVisits;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "member_id")
    private Set<Member> cellMembers;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "visitors_id")
    private Set<Visitors> visitor;

    public String getCellName() {
        return cellName;
    }

    public void setCellName(String cellName) {
        this.cellName = cellName;
    }

    public Leaders getCellLeader() {
        return cellLeader;
    }

    public void setCellLeader(Leaders cellLeader) {
        this.cellLeader = cellLeader;
    }

    public LocalDate getMeetDate() {
        return meetDate;
    }

    public void setMeetDate(LocalDate meetDate) {
        this.meetDate = meetDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Set<PastoralVisit> getPastoralVisits() {
        return pastoralVisits;
    }

    public void setPastoralVisits(Set<PastoralVisit> pastoralVisits) {
        this.pastoralVisits = pastoralVisits;
    }

    public Set<Member> getCellMembers() {
        return cellMembers;
    }

    public void setCellMembers(Set<Member> cellMembers) {
        this.cellMembers = cellMembers;
    }

    public Set<Visitors> getVisitor() {
        return visitor;
    }

    public void setVisitor(Set<Visitors> visitor) {
        this.visitor = visitor;
    }
}
