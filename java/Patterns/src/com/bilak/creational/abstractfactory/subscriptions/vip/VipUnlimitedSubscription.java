package com.bilak.creational.abstractfactory.subscriptions.vip;

import com.bilak.creational.abstractfactory.PriceConstants;
import com.bilak.creational.abstractfactory.subscriptions.UnlimitedSubscription;

import java.time.LocalDateTime;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class VipUnlimitedSubscription
 * @since 9/19/2022 - 21.44
 **/
public class VipUnlimitedSubscription implements UnlimitedSubscription {
    private double price;
    private LocalDateTime dateFrom;
    private LocalDateTime dateTo;

    public VipUnlimitedSubscription() {
    }

    public VipUnlimitedSubscription(LocalDateTime dateFrom, LocalDateTime dateTo) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    @Override
    public double getPrice() {
        return PriceConstants.BASE_PRICE_UNLIMITED * 2;
    }

    @Override
    public void makePass() {
        System.out.println("Vip pass");
    }

    @Override
    public String toString() {
        return "VipUnlimitedSubscription{" +
                "price=" + price +
                ", dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                ", price=" + getPrice() +
                '}';
    }
}
