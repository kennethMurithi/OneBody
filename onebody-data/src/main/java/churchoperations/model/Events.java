package churchoperations.model;

import java.time.LocalDate;

public class Events {
    private String eventName;
    private LocalDate date;
    private String venue;
    private String comments;
    private String speakerNames;
    private Leaders leader;

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

    public Leaders getLeader() {
        return leader;
    }

    public void setLeader(Leaders leader) {
        this.leader = leader;
    }
}
