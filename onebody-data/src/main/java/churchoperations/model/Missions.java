package churchoperations.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Missions")
public class Missions extends BaseEntity {

    @Column(name = "date")
    private String date;

    @Column(name = "venue")
    private String venue;

    @Column(name = "period")
    private String period;

    @OneToMany
    private Set<Missioners> missioners = new HashSet<>();

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
