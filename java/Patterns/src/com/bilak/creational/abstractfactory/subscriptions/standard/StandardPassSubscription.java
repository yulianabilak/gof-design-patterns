package com.bilak.creational.abstractfactory.subscriptions.standard;

import com.bilak.creational.abstractfactory.PriceConstants;
import com.bilak.creational.abstractfactory.subscriptions.PassSubscription;

import java.time.LocalDateTime;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class StandardPassSubscription
 * @since 9/19/2022 - 21.42
 **/
public class StandardPassSubscription implements PassSubscription {
    private int passes;
    private LocalDateTime dateFrom;
    private LocalDateTime dateTo;

    public StandardPassSubscription() {
    }

    public StandardPassSubscription(int passes, LocalDateTime dateFrom, LocalDateTime dateTo) {
        this.passes = passes;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    @Override
    public double getPrice() {
        return PriceConstants.BASE_PRICE_PER_PASS * passes;
    }

    @Override
    public void makePass() {
        System.out.println("Standard pass");
    }

    @Override
    public String toString() {
        return "StandardPassSubscription{" +
                "passes=" + passes +
                ", dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                ", price=" + getPrice() +
                '}';
    }
}
