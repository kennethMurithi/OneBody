package churchoperations.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "CalenderOfEvents")
public class CalenderOfEvents {

    @Column(name = "event_name")
    private String eventName;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "venue")
    private String venue;

    @Column(name = "comments")
    private String comments;

    @Column(name = "speakerNames")
    private String speakerNames;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "leader_id")
    private Set<Leaders> leader = new HashSet<>();

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getSpeakerNames() {
        return speakerNames;
    }

    public void setSpeakerNames(String speakerNames) {
        this.speakerNames = speakerNames;
    }

    public Set<Leaders> getLeader() {
        return leader;
    }

    public void setLeader(Set<Leaders> leader) {
        this.leader = leader;
    }
}
