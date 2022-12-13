package com.bilak.structural.composite;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Worker
 * @since 10/10/2022 - 14.31
 **/
public class Worker implements Employee {
    private int id;
    private String name;
    private String position;
    private double salary;

    public Worker() {
    }

    public Worker(int id, String name, String position, double salary) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }


    @Override
    public double getSalary() {
        return salary;
    }
}
