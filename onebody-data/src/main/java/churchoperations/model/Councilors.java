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
    private Set<counselling> requestedvisits = new HashSet<>();

    public Set<counselling> getRequestedvisits() {
        return requestedvisits;
    }

    public void setRequestedvisits(Set<counselling> requestedvisits) {
        this.requestedvisits = requestedvisits;
    }
}
