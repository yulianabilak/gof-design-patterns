package com.bilak.behavioral.state.states;

import com.bilak.behavioral.state.context.SubscriptionPurchase;

import java.time.LocalDateTime;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class ErrorState
 * @since 11/13/2022 - 14.24
 **/
public class ErrorState implements State {
    private final SubscriptionPurchase purchase;

    public ErrorState(SubscriptionPurchase purchase) {
        this.purchase = purchase;
    }

    @Override
    public void changeState() {
        System.out.println("There was some error. This will be the last state then");
    }

    @Override
    public LocalDateTime getDate() {
        System.out.println("ERROR STATE: Date of error: " + LocalDateTime.now());
        return null;
    }

    @Override
    public double getPrice() {
        return 0;
    }
}
