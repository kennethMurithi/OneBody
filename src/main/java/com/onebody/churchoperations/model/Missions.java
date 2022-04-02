package com.onebody.churchoperations.model;

import java.util.Set;

public class Missions {
    private String date;
    private String venue;
    private String period;
    private Set<Missioners> missioners;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Set<Missioners> getMissioners() {
        return missioners;
    }

    public void setMissioners(Set<Missioners> missioners) {
        this.missioners = missioners;
    }
}
