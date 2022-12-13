package com.bilak.behavioral.template;

import java.time.LocalDate;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Client
 * @since 11/25/2022 - 19.36
 **/
public class Client {
    private String name;
    private String phoneNumber;
    private String document;
    private LocalDate birthday;

    public Client(String name, String phoneNumber, String document, LocalDate birthday) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.document = document;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", document='" + document + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
