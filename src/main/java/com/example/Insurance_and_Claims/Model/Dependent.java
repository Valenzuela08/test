package com.example.Insurance_and_Claims.Model;

import com.example.Insurance_and_Claims.Model.Client;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="client_dependent")
public class Dependent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="dependent_id")
    private long dependent_id;

    @ManyToOne
    @JoinColumn(name ="client_id")
    private Client client;

    @JsonBackReference
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }

    @Column(name="firstname")
    private String firstname;

    @Column(name="middlename")
    private String middlename;

    @Column(name="lastname")
    private String lastname;

    @Column(name="suffixname")
    private String suffixname;

    @Column(name="sex")
    private String gender;

    @Column(name="birthdate")
    private Date birthdate;

    @Column(name="mobilenumber")
    private String phonenumber;

    @Column(name="relationship")
    private String relationship;

    public Dependent(long dependent_id, String firstname, String middlename, String lastname, String suffixname, String gender, Date birthdate, String phonenumber, String relationship) {
        this.dependent_id = dependent_id;
        this.firstname = firstname;
        this.middlename = middlename;
        this.lastname = lastname;
        this.suffixname = suffixname;
        this.gender = gender;
        this.birthdate = birthdate;
        this.phonenumber = phonenumber;
        this.relationship = relationship;
    }

    public Dependent() {
    }

    public long getDependent_id() {
        return dependent_id;
    }

    public void setDependent_id(long dependent_id) {
        this.dependent_id = dependent_id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSuffixname() {
        return suffixname;
    }

    public void setSuffixname(String suffixname) {
        this.suffixname = suffixname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }
}
