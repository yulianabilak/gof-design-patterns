package com.bilak.creational.builder;

import java.time.LocalDate;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Client
 * @since 9/19/2022 - 13.26
 **/
public class Client {
    private String name;
    private LocalDate birthDate;
    private String phoneNumber;

    public Client() {
    }

    public Client(String name, LocalDate birthDate, String phoneNumber) {
        this.name = name;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
