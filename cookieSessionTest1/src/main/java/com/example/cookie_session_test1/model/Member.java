package com.example.cookie_session_test1.model;

public class Member {

    public Member() {
    }

    int Id;
    String name;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Member(int id, String name) {
        Id = id;
        this.name = name;
    }
}
