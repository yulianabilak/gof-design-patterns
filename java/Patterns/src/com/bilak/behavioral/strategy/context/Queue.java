package com.bilak.behavioral.strategy.context;

import com.bilak.behavioral.strategy.strategies.StatusStrategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Queue
 * @since 11/21/2022 - 10.50
 **/
public class Queue {
    private int lift;
    private StatusStrategy strategy;
    private final List<Client> queue;

    public Queue(int lift, StatusStrategy strategy) {
        this.lift = lift;
        this.strategy = strategy;
        this.queue = new ArrayList<>();
    }

    public void queue(Client client) {
        strategy.pass(client, queue);
    }

    public int getLift() {
        return lift;
    }

    public void setLift(int lift) {
        this.lift = lift;
    }

    public StatusStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(StatusStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Client> getQueue() {
        return queue;
    }
}
