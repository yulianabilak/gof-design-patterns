package com.bilak.creational.factorymethod.factories;

import com.bilak.creational.factorymethod.subscriptions.Subscription;
import com.bilak.creational.factorymethod.subscriptions.VipSubscription;

import java.time.LocalDateTime;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class VipSubscriptionFactory
 * @since 9/19/2022 - 23.32
 **/
public class VipSubscriptionFactory extends SubscriptionFactory {
    @Override
    public Subscription createSubscription(double price, LocalDateTime from, LocalDateTime to) {
        if (price <= 0) {
            throw new IllegalArgumentException("Price can't be less than 0.");
        }
        if (from.isAfter(to)) {
            throw new IllegalArgumentException("Start date can't be later than end date.");
        }
        return new VipSubscription(price, from, to);
    }
}
