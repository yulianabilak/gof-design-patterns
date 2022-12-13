package com.bilak.behavioral.observer;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Client
 * @since 11/13/2022 - 16.56
 **/
public class Client implements Subscriber {
    private String name;
    private String email;

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void update(String eqName, String eqCategory) {
        System.out.println("Hello, " + name + "! Equipment " + eqName + " " + eqCategory + " just got restocked.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
