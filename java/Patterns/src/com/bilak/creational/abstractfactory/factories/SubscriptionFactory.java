package com.bilak.creational.abstractfactory.factories;

import com.bilak.creational.abstractfactory.subscriptions.PassSubscription;
import com.bilak.creational.abstractfactory.subscriptions.TimedSubscription;
import com.bilak.creational.abstractfactory.subscriptions.UnlimitedSubscription;

import java.time.LocalDateTime;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class SubscriptionFactory
 * @since 9/19/2022 - 21.47
 **/
public interface SubscriptionFactory {
    PassSubscription createPassSubscription(int passes, LocalDateTime dateFrom);
    TimedSubscription createTimedSubscription(LocalDateTime from, LocalDateTime to);
    UnlimitedSubscription createUnlimitedSubscription(LocalDateTime dateFrom);
}
