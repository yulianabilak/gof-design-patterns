package com.bilak.structural.composite;

import java.util.Arrays;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Main
 * @since 10/10/2022 - 14.02
 **/
public class Main {
    public static void main(String[] args) {
        Department main = new Department(1, "Main", Arrays.asList(
                new Worker(1, "Kippie Nelson", "owner", 100000),
                new Worker(2, "Maisie Chilcott", "manager", 50000),
                new Worker(3, "Morly Liger", "administrator", 45000),
                new Department(2, "Instructors", Arrays.asList(
                        new Department(3, "Ski instructors", Arrays.asList(
                                new Worker(4, "Hettie Rawson", "ski instructor", 30000),
                                new Worker(5, "Benetta Beche", "ski instructor", 29060)
                        )),
                        new Department(4, "Snowboard instructors", Arrays.asList(
                                new Worker(6, "Hewet Klemke", "snowboard instructor", 25000),
                                new Worker(7, "Domenic Petrescu", "snowboard instructor", 25000)
                        )),
                        new Worker(8, "Asher Magnay", "instructor", 44030)
                )),
                new Department(5, "Hotel", Arrays.asList(
                        new Worker(9, "Jacqui Mayberry", "administrator", 12000),
                        new Worker(10, "Jenifer Schumacher", "janitor", 8000),
                        new Worker(11, "Gray Sturt", "technician", 9500)
                ))
        ));
        System.out.println("Money earned by everyone in the main department: " + main.getSalary());
    }
}
