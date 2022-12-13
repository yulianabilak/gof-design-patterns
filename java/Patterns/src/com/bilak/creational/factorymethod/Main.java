package com.bilak.creational.factorymethod;

import com.bilak.creational.factorymethod.factories.SubscriptionFactory;
import com.bilak.creational.factorymethod.subscriptions.StandardSubscription;
import com.bilak.creational.factorymethod.subscriptions.Subscription;
import com.bilak.creational.factorymethod.factories.StandardSubscriptionFactory;
import com.bilak.creational.factorymethod.factories.VipSubscriptionFactory;

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
        Subscription subscription;
        Scanner in = new Scanner(System.in);
        System.out.println("Choose subscription type (V or S): ");
        String type = in.nextLine();
        try {
            if (Objects.equals(type, "S")) {
                factory = new StandardSubscriptionFactory();
                subscription = factory.createSubscription(300, LocalDateTime.of(2022, 12, 12, 9, 45),
                        LocalDateTime.of(2022, 12, 19, 11, 11));
            } else if (Objects.equals(type, "V")) {
                factory = new VipSubscriptionFactory();
                subscription = factory.createSubscription(600, LocalDateTime.of(2022, 12, 12, 9, 45),
                        LocalDateTime.of(2022, 12, 19, 11, 11));
            } else throw new IllegalArgumentException("Wrong subscription category.");
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
        LiftQueue queue = new LiftQueue(1);
        queue.add(new StandardSubscription(100, LocalDateTime.now(), LocalDateTime.now().plusDays(1)));
        queue.add(subscription);
        System.out.println(queue);
    }
}
