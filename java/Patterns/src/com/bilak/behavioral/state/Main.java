package com.bilak.behavioral.state;

import com.bilak.behavioral.state.context.SubscriptionPurchase;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Main
 * @since 11/13/2022 - 13.01
 **/
public class Main {
    public static void main(String[] args) {
        SubscriptionPurchase subscriptionPurchase = new SubscriptionPurchase("Yuliana Bilak", "timed");
        System.out.println("Price: " + subscriptionPurchase.getPrice());
        System.out.println("Date: " + subscriptionPurchase.getDate());

        System.out.println();

        subscriptionPurchase.changeState();
        System.out.println("Price: " + subscriptionPurchase.getPrice());
        System.out.println("Date: " + subscriptionPurchase.getDate());

        System.out.println("\n" + subscriptionPurchase);
    }
}
