package com.jpop.user.entity;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {
    @Id
    @Column(name = "id")
    int id;
    @Column(name="first_name")
    String firstName;
    @Column(name="last_name")
    String lastName;

    User(){

    }

    public User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
