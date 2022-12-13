package com.bilak.behavioral.chainofresp.request;

import java.time.LocalDate;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Client
 * @since 11/5/2022 - 15.22
 **/
public class Client {
    private String name;
    private LocalDate dateOfBirth;
    private String benefit;

    public Client(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Client(String name, LocalDate dateOfBirth, String benefit) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.benefit = benefit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getBenefit() {
        return benefit;
    }

    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }
}
