package com.spring.hibernate.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
//@NamedQueries({
//        @NamedQuery(name = "User.findAll", query = "select u.id from User u")
//})
public class User implements Serializable {
    private Integer id;
    private String name;
    private Integer vipId;

    public User() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //    @OneToOne
    public Integer getVipId() {
        return vipId;
    }

    public void setVipId(Integer vipId) {
        this.vipId = vipId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vipId=" + vipId +
                '}';
    }
}

