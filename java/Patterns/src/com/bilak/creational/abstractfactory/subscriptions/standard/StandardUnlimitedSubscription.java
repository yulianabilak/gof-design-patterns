package com.bilak.creational.abstractfactory.subscriptions.standard;

import com.bilak.creational.abstractfactory.PriceConstants;
import com.bilak.creational.abstractfactory.subscriptions.UnlimitedSubscription;

import java.time.LocalDateTime;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class StandardUnlimitedSubscription
 * @since 9/19/2022 - 21.42
 **/
public class StandardUnlimitedSubscription implements UnlimitedSubscription {
    private double price;
    private LocalDateTime dateFrom;
    private LocalDateTime dateTo;

    public StandardUnlimitedSubscription() {
    }

    public StandardUnlimitedSubscription(LocalDateTime dateFrom, LocalDateTime dateTo) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    @Override
    public double getPrice() {
        return PriceConstants.BASE_PRICE_UNLIMITED;
    }

    @Override
    public void makePass() {
        System.out.println("Standard pass");
    }

    @Override
    public String toString() {
        return "StandardUnlimitedSubscription{" +
                "price=" + price +
                ", dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                ", price=" + getPrice() +
                '}';
    }
}
