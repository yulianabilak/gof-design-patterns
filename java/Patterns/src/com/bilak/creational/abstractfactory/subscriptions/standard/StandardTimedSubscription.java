package com.bilak.creational.abstractfactory.subscriptions.standard;

import com.bilak.creational.abstractfactory.PriceConstants;
import com.bilak.creational.abstractfactory.subscriptions.TimedSubscription;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class StandardTimedSubscription
 * @since 9/19/2022 - 21.42
 **/
public class StandardTimedSubscription implements TimedSubscription {
    private LocalDateTime dateFrom;
    private LocalDateTime dateTo;

    public StandardTimedSubscription() {
    }

    public StandardTimedSubscription(LocalDateTime dateFrom, LocalDateTime dateTo) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    @Override
    public double getPrice() {
        double price = 0;
        int days = (int) ChronoUnit.DAYS.between(dateFrom, dateTo);
        if (days != 0) {
            price = PriceConstants.BASE_PRICE_PER_DAY * days;
        }
        int hours = (int) ChronoUnit.HOURS.between(dateFrom.plusDays(days), dateTo);
        price += PriceConstants.BASE_PRICE_PER_HOUR * hours;
        return price;
    }

    @Override
    public void makePass() {
        System.out.println("Standard pass");
    }

    @Override
    public String toString() {
        return "StandardTimedSubscription{" +
                "dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                ", price=" + getPrice() +
                '}';
    }
}
