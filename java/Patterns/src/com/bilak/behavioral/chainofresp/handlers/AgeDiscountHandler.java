package com.bilak.behavioral.chainofresp.handlers;

import com.bilak.behavioral.chainofresp.request.SubscriptionPurchaseRequest;

import java.time.LocalDate;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class AgeDiscountHandler
 * @since 11/5/2022 - 15.40
 **/
public class AgeDiscountHandler extends DiscountHandler {
    @Override
    public double getDiscount(SubscriptionPurchaseRequest request) {
        double result = 0;
        LocalDate clientBirthDate = request.getClient().getDateOfBirth();
        LocalDate now = LocalDate.now();
        if (clientBirthDate.isAfter(now.minusYears(10)) || clientBirthDate.isBefore(now.minusYears(60))) {
            System.out.println("Applying discount for age...");
            result = 0.05;
        }
        return result + super.getDiscount(request);
    }
}
