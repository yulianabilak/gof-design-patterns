package com.bilak.creational.abstractfactory.subscriptions.vip;

import com.bilak.creational.abstractfactory.PriceConstants;
import com.bilak.creational.abstractfactory.subscriptions.PassSubscription;

import java.time.LocalDateTime;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class VipPassSubscription
 * @since 9/19/2022 - 21.43
 **/
public class VipPassSubscription implements PassSubscription {
    private int passes;
    private LocalDateTime dateFrom;
    private LocalDateTime dateTo;

    public VipPassSubscription() {
    }

    public VipPassSubscription(int passes, LocalDateTime dateFrom, LocalDateTime dateTo) {
        this.passes = passes;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    @Override
    public double getPrice() {
        return PriceConstants.BASE_PRICE_PER_PASS * passes * 2;
    }

    @Override
    public void makePass() {
        System.out.println("Vip pass");
    }

    @Override
    public String toString() {
        return "VipPassSubscription{" +
                "passes=" + passes +
                ", dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                ", price=" + getPrice() +
                '}';
    }
}
