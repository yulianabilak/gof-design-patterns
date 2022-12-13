package com.bilak.behavioral.template;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Main
 * @since 11/25/2022 - 15.20
 **/
public class Main {
    public static void main(String[] args) {
        EquipmentRental rental = new SkiRental();
         if (rental.rent()) {
             System.out.println("Ski rental success");
         }
         else {
             System.out.println("Couldn't rent");
         }
        System.out.println("==================================================");
         rental = new SnowboardRental();
        if (rental.rent()) {
            System.out.println("Snowboard rental success");
        }
        else {
            System.out.println("Couldn't rent");
        }
    }
}
