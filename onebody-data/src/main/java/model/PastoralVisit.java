package model;

import java.time.LocalDate;
import java.util.Set;

public class PastoralVisit {
    private LocalDate date;
    private String location;
    private String comments;
    private Set<Members> members;
    private Set<Leaders> leaders;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Set<Members> getMembers() {
        return members;
    }

    public void setMembers(Set<Members> members) {
        this.members = members;
    }

    public Set<Leaders> getLeaders() {
        return leaders;
    }

    public void setLeaders(Set<Leaders> leaders) {
        this.leaders = leaders;
    }
}
