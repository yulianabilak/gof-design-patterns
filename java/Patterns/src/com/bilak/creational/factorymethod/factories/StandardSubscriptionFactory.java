package com.bilak.creational.factorymethod.factories;

import com.bilak.creational.factorymethod.subscriptions.StandardSubscription;
import com.bilak.creational.factorymethod.subscriptions.Subscription;

import java.time.LocalDateTime;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class StandardSubscriptionFactory
 * @since 9/19/2022 - 23.33
 **/
public class StandardSubscriptionFactory extends SubscriptionFactory {
    @Override
    public Subscription createSubscription(double price, LocalDateTime from, LocalDateTime to) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price can't be less than 0.");
        }
        if (from.isAfter(to)) {
            throw new IllegalArgumentException("Start date can't be later than end date.");
        }
        return new StandardSubscription(price, from, to);
    }
}
