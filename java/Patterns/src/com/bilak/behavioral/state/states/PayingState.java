package com.bilak.behavioral.state.states;

import com.bilak.behavioral.state.context.SubscriptionPurchase;

import java.time.LocalDateTime;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class PayingState
 * @since 11/13/2022 - 14.14
 **/
public class PayingState implements State {
    private final SubscriptionPurchase purchase;

    public PayingState(SubscriptionPurchase purchase) {
        this.purchase = purchase;
    }

    @Override
    public void changeState() {
        System.out.println("This is the final state. No more changes");
    }

    @Override
    public LocalDateTime getDate() {
        return LocalDateTime.now();
    }

    @Override
    public double getPrice() {
        System.out.println("PAYING STATE: Payment is being processed right now");
        switch (purchase.getType()) {
            case "timed":
                return 50.5;
            case "passed":
                return 70.7;
            case "unlimited":
                return 30000;
            default:
                System.out.println("Error. Unknown type");
                purchase.setState(new ErrorState(purchase));
                return 0;
        }
    }
}
