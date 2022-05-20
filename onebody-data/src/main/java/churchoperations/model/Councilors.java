package churchoperations.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Councilors")
public class Councilors extends Member {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "councilor")
    private Set<CouncilorVisits> requestedvisits = new HashSet<>();

    public Set<CouncilorVisits> getRequestedvisits() {
        return requestedvisits;
    }

    public void setRequestedvisits(Set<CouncilorVisits> requestedvisits) {
        this.requestedvisits = requestedvisits;
    }
}
