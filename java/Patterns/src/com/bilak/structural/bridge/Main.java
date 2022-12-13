package com.bilak.structural.bridge;

import com.bilak.structural.bridge.abstraction.PassSubscription;
import com.bilak.structural.bridge.abstraction.TimedSubscription;
import com.bilak.structural.bridge.implementation.Queue;
import com.bilak.structural.bridge.implementation.StandardQueue;
import com.bilak.structural.bridge.implementation.VipQueue;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Main
 * @since 10/2/2022 - 19.27
 **/
public class Main {
    public static void main(String[] args) {
        testPass(new StandardQueue(1));
        testPass(new VipQueue(1));
    }

    public static void testPass(Queue queue) {
        System.out.println("Test pass subscription\n");
        PassSubscription subscription1 = new PassSubscription(1, "Yuliana Bilak", 500.5, LocalDateTime.of(2022, 9, 30, 12, 25), queue, 20);
        subscription1.pass();

        System.out.println("\nTest timed subscription\n");
        LocalDate start = LocalDate.of(2022, 9, 30);
        LocalDate end = LocalDate.of(2022, 10, 5);
        TimedSubscription subscription2 = new TimedSubscription(2, "Bilak Yuliana", 300.6, LocalDateTime.of(2022,9,30,12,12), queue, start, end);
        subscription2.pass();

        System.out.println("\n\n" + queue + "\n==================================================================");
    }
}
