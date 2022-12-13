package com.bilak.creational.factorymethod.subscriptions;

import java.time.LocalDateTime;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class VipSubscription
 * @since 9/19/2022 - 23.28
 **/
public class VipSubscription implements Subscription {
    private double price;
    private LocalDateTime dateFrom;
    private LocalDateTime dateTo;

    public VipSubscription(double price, LocalDateTime dateFrom, LocalDateTime dateTo) {
        this.price = price;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    @Override
    public String toString() {
        return "VipSubscription{" +
                "price=" + price +
                ", dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                '}';
    }

    @Override
    public double getPrice() {
        return price;
    }
}
