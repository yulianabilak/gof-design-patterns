package com.bilak.behavioral.state.states;

import com.bilak.behavioral.state.context.SubscriptionPurchase;

import java.time.LocalDateTime;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class StartState
 * @since 11/13/2022 - 13.27
 **/
public class StartState implements State {
    private final SubscriptionPurchase purchase;

    public StartState(SubscriptionPurchase purchase) {
        this.purchase = purchase;
    }

    @Override
    public void changeState() {
        purchase.setState(new PayingState(purchase));
    }

    @Override
    public LocalDateTime getDate() {
        System.out.println("START STATE: No date yet");
        return null;
    }

    @Override
    public double getPrice() {
        System.out.println("START STATE: No price yet");
        return 0;
    }
}
