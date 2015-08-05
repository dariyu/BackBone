package com.epam.backbone.model;


public class user {

    private String firstname;
    private String lasttname;
    private int age;

    public user(String firstname, String lasttname, int age) {
        this.firstname = firstname;
        this.lasttname = lasttname;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLasttname() {
        return lasttname;
    }

    public void setLasttname(String lasttname) {
        this.lasttname = lasttname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
