package churchoperations.model;

import java.util.Set;

public class CounselingVisits{
    private Member member;
    private String date;
    private String description;
    private Set<Counselors> counselors;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

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

    public Set<Counselors> getCounselors() {
        return counselors;
    }

    public void setCounselors(Set<Counselors> counselors) {
        this.counselors = counselors;
    }
}
