package model;

import java.util.Set;

public class Members {
    private String firstName;
    private String secondName;
    private String lastName;
    private String Address;
    private String City;
    private String telephone;
    private String email;
    private Set<String> CounselingVisits;
    private Set<String> Departments;

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

    public Set<String> getCounselingVisits() {
        return CounselingVisits;
    }

    public void setCounselingVisits(Set<String> counselingVisits) {
        CounselingVisits = counselingVisits;
    }

    public Set<String> getDepartments() {
        return Departments;
    }

    public void setDepartments(Set<String> departments) {
        Departments = departments;
    }




}
