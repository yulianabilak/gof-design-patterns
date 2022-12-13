package com.bilak.behavioral.chainofresp.handlers;

import com.bilak.behavioral.chainofresp.request.SubscriptionPurchaseRequest;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class DiscountHandler
 * @since 11/5/2022 - 15.26
 **/
public abstract class DiscountHandler {
    protected DiscountHandler nextHandler;

    public DiscountHandler setNextHandler(DiscountHandler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    //handle
    public double getDiscount(SubscriptionPurchaseRequest request) {
        if (nextHandler != null) {
            return nextHandler.getDiscount(request);
        }
        else {
            return 0;
        }
    }
}
