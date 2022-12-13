package com.bilak.behavioral.chainofresp.handlers;

import com.bilak.behavioral.chainofresp.request.SubscriptionPurchaseRequest;

import java.time.LocalDateTime;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class DateDiscountHandler
 * @since 11/5/2022 - 16.06
 **/
public class DateDiscountHandler extends DiscountHandler {
    @Override
    public double getDiscount(SubscriptionPurchaseRequest request) {
        double result = 0;
        LocalDateTime sellDate = request.getSellDate();
        if (sellDate.isBefore(LocalDateTime.of(sellDate.getYear(), 4, 1, 0 , 0)) && sellDate.isAfter(LocalDateTime.of(sellDate.getYear(), 2, 25, 0, 0))) {
            System.out.println("Applying discount for date...");
            result = 0.03;
        }
        return result + super.getDiscount(request);
    }
}
