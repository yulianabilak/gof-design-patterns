package com.bilak.structural.bridge.abstraction;

import com.bilak.structural.bridge.implementation.Queue;

import java.time.LocalDateTime;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class PassSubscription
 * @since 10/2/2022 - 19.14
 **/
public class PassSubscription extends Subscription {
    private int passes;

    public PassSubscription(Integer id, String client, Double price, LocalDateTime sellDate, Queue queue, int passes) {
        super(id, client, price, sellDate, queue);
        this.passes = passes;
    }

    @Override
    public void pass() {
        passes = passes - 1;
        if (passes != 0) {
            System.out.println("Recorded pass from Subscription(pass) #" + id);
            queue.pass(client);
        }
        else System.out.println("Client with Subscription #" + id + " is not allowed to pass with 0 passes");
    }

    @Override
    public Double getPrice() {
        return null;
    }

    public int getPasses() {
        return passes;
    }

    public void setPasses(int passes) {
        this.passes = passes;
    }
}
