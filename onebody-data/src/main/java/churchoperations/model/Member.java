package churchoperations.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Members")
public class Member extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name")
    private String secondName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "address")
    private String Address;

    @Column(name = "city")
    private String City;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "email")
    private String email;

    @ManyToOne
    @JoinColumn(name = "position_id")
    private Set<Position> position = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "Departments")
    private Set<Departments> departments = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "member")
    private Set<counselling> councilorVisits = new HashSet<>();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<churchoperations.model.Departments> getDepartments() {
        return departments;
    }

    public void setDepartments(Set<churchoperations.model.Departments> departments) {
        this.departments = departments;
    }


}
