package com.bilak.creational.builder;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Main
 * @since 9/24/2022 - 19.37
 **/
public class Main {
    public static void main(String[] args) {
        Client client = new Client("Yuliana Bilak", LocalDate.of(2003,1,2), "+38066084977");
        Worker worker = new Worker("Olena Petryk", "administrator");
        Subscription subscription = new Subscription.SubscriptionBuilder()
                .setClient(client)
                .setDiscount(0.04)
                .setId(1)
                .setEndDate(LocalDateTime.now().plusDays(1))
                .setStartDate(LocalDateTime.now())
                .setIssuedBy(worker)
                .setSellDate(LocalDateTime.now())
                .setPrice(500.0)
                .setType(SubscriptionType.TIMED)
                .build();
        System.out.println(subscription);
    }
}
