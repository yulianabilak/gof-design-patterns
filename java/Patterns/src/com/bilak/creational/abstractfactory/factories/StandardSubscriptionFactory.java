package com.bilak.creational.abstractfactory.factories;

import com.bilak.creational.abstractfactory.subscriptions.PassSubscription;
import com.bilak.creational.abstractfactory.subscriptions.TimedSubscription;
import com.bilak.creational.abstractfactory.subscriptions.UnlimitedSubscription;
import com.bilak.creational.abstractfactory.subscriptions.standard.StandardPassSubscription;
import com.bilak.creational.abstractfactory.subscriptions.standard.StandardTimedSubscription;
import com.bilak.creational.abstractfactory.subscriptions.standard.StandardUnlimitedSubscription;

import java.time.LocalDateTime;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class StandardSubscriptionFactory
 * @since 9/19/2022 - 21.52
 **/
public class StandardSubscriptionFactory implements SubscriptionFactory {
    @Override
    public PassSubscription createPassSubscription(int passes, LocalDateTime dateFrom) {
        if (passes <= 0) throw new IllegalArgumentException("Passes can't be less than 0.");
        return new StandardPassSubscription(passes, dateFrom, dateFrom.plusDays(1));
    }

    @Override
    public TimedSubscription createTimedSubscription(LocalDateTime from, LocalDateTime to) {
        if (from.isAfter(to)) {
            throw new IllegalArgumentException("Start date can't be later than end date.");
        }
        return new StandardTimedSubscription(from, to);
    }

    @Override
    public UnlimitedSubscription createUnlimitedSubscription(LocalDateTime from) {
        LocalDateTime to;
        if (from.isBefore(LocalDateTime.of(from.getYear(), 4, 1, 0, 0))) {
            to = LocalDateTime.of(from.getYear(), 4, 1, 0, 0);
        }
        else to = LocalDateTime.of(from.getYear()+1, 4, 1, 0, 0);
        return new StandardUnlimitedSubscription(from, to);
    }
}
