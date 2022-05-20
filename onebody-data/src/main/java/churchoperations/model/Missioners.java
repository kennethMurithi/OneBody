package churchoperations.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "Missioners")
public class Missioners extends Member {

    private Set<FlymMembers> flymMembers;

    public Set<FlymMembers> getFlymMembers() {
        return flymMembers;
    }

    public void setFlymMembers(Set<FlymMembers> flymMembers) {
        this.flymMembers = flymMembers;
    }
}
