package com.bilak.behavioral.chainofresp.handlers;

import com.bilak.behavioral.chainofresp.request.SubscriptionPurchaseRequest;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class BenefitDiscountHandler
 * @since 11/5/2022 - 17.47
 **/
public class BenefitDiscountHandler extends DiscountHandler {
    @Override
    public double getDiscount(SubscriptionPurchaseRequest request) {
        double result = 0;
        if (request.getClient().getBenefit() != null) {
            System.out.println("Applying discount for benefit...");
            result = 0.1;
        }
        return result + super.getDiscount(request);
    }
}
