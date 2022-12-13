package com.bilak.structural.bridge.abstraction;

import com.bilak.structural.bridge.implementation.Queue;

import java.time.LocalDateTime;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Subscription
 * @since 10/2/2022 - 18.52
 **/
public abstract class Subscription {
    protected Integer id;
    protected String client;
    protected Double price;
    protected LocalDateTime sellDate;
    protected Queue queue;

    protected Subscription(Integer id, String client, Double price, LocalDateTime sellDate, Queue queue) {
        this.id = id;
        this.client = client;
        this.price = price;
        this.sellDate = sellDate;
        this.queue = queue;
    }

    public abstract void pass();
    public abstract Double getPrice();
}
