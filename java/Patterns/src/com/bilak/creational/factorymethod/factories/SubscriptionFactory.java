package com.bilak.creational.factorymethod.factories;

import com.bilak.creational.factorymethod.subscriptions.Subscription;

import java.time.LocalDateTime;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class SubscriptionFactory
 * @since 9/18/2022 - 17.14
 **/
public abstract class SubscriptionFactory {
    public abstract Subscription createSubscription(double price, LocalDateTime from, LocalDateTime to);
}
