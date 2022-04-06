package model;

import java.util.Set;

public class Depertment extends BaseEntity {
    private Member member;
    private Position position;
    private String duties;
    private Set<Events> events;

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String getDuties() {
        return duties;
    }

    public void setDuties(String duties) {
        this.duties = duties;
    }
}
