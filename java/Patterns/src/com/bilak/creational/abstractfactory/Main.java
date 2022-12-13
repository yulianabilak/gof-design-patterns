package com.bilak.creational.abstractfactory;

import com.bilak.creational.abstractfactory.factories.StandardSubscriptionFactory;
import com.bilak.creational.abstractfactory.factories.SubscriptionFactory;
import com.bilak.creational.abstractfactory.factories.VipSubscriptionFactory;
import com.bilak.creational.abstractfactory.subscriptions.PassSubscription;
import com.bilak.creational.abstractfactory.subscriptions.TimedSubscription;
import com.bilak.creational.abstractfactory.subscriptions.UnlimitedSubscription;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Scanner;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Main
 * @since 9/17/2022 - 19.06
 **/
public class Main {
    public static void main(String[] args) {
        SubscriptionFactory factory;
        PassSubscription passSubscription;
        TimedSubscription timedSubscription;
        UnlimitedSubscription unlimitedSubscription;
        Scanner in = new Scanner(System.in);
        System.out.println("Choose subscription category (V or S): ");
        String category = in.nextLine();
        try {
            if (Objects.equals(category, "S")) {
                factory = new StandardSubscriptionFactory();
                passSubscription = factory.createPassSubscription(23, LocalDateTime.now());
                timedSubscription = factory.createTimedSubscription(LocalDateTime.of(2022, 12, 12, 9, 45),
                        LocalDateTime.of(2022, 12, 19, 11, 11));
                unlimitedSubscription = factory.createUnlimitedSubscription(LocalDateTime.of(2022, 1, 10, 8, 2));
            } else if (Objects.equals(category, "V")) {
                factory = new VipSubscriptionFactory();
                passSubscription = factory.createPassSubscription(23, LocalDateTime.now());
                timedSubscription = factory.createTimedSubscription(LocalDateTime.of(2022, 12, 12, 9, 45),
                        LocalDateTime.of(2022, 12, 19, 11, 11));
                unlimitedSubscription = factory.createUnlimitedSubscription(LocalDateTime.of(2022, 1, 10, 8, 2));
            } else throw new IllegalArgumentException("Wrong subscription category.");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println(passSubscription);
        System.out.println(timedSubscription);
        System.out.println(unlimitedSubscription);
    }
}
