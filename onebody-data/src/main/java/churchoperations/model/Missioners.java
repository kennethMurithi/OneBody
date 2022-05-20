package churchoperations.model;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Missioners")
public class Missioners extends BaseEntity{

    @OneToMany
    private Set<FlymMembers> flymMembers = new HashSet<>();

    @OneToMany
    private Set<Member> members = new HashSet<>();

    public Set<FlymMembers> getFlymMembers() {
        return flymMembers;
    }

    public void setFlymMembers(Set<FlymMembers> flymMembers) {
        this.flymMembers = flymMembers;
    }

    public Set<Member> getMembers() {
        return members;
    }

    public void setMembers(Set<Member> members) {
        this.members = members;
    }
}
