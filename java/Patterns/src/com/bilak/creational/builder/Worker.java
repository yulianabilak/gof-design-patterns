package com.bilak.creational.builder;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Worker
 * @since 9/24/2022 - 19.46
 **/
public class Worker {
    private String name;
    private String position;

    public Worker() {
    }

    public Worker(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
