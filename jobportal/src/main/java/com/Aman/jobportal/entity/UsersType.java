package com.Aman.jobportal.entity;


import jakarta.persistence.*;
import org.hibernate.usertype.UserType;

import java.util.List;

@Entity
@Table(name = "users_type")
public class UsersType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userTypeId;
    private String userTypename;
    @OneToMany(targetEntity = Users.class,mappedBy = "userTypeId",cascade = CascadeType.ALL)
    private List<Users> users;

    public UsersType(){

    }

    public UsersType(int userTypeId, String userTypename, List<Users> users) {
        this.userTypeId = userTypeId;
        this.userTypename = userTypename;
        this.users = users;
    }

    public int getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(int userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getUserTypename() {
        return userTypename;
    }

    public void setUserTypename(String userTypename) {
        this.userTypename = userTypename;
    }

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "UsersType{" +
                "userTypeId=" + userTypeId +
                ", userTypename='" + userTypename + '\'' +
                ", users=" + users +
                '}';
    }
}
