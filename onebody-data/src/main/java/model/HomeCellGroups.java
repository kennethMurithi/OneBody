package model;

import java.time.LocalDate;
import java.util.Set;

public class HomeCellGroups extends BaseEntity{
    private String cellName;
    private Leaders cellLeader;
    private LocalDate meetDate;
    private String comments;
    private Set<PastoralVisit> pastoralVisits;
    private Set<Member> cellMembers;

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
}
