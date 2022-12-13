package com.bilak.behavioral.state.context;

import com.bilak.behavioral.state.states.StartState;
import com.bilak.behavioral.state.states.State;

import java.time.LocalDateTime;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class SubscriptionPurchase
 * @since 11/13/2022 - 13.08
 **/
public class SubscriptionPurchase {
    private final String client;
    private LocalDateTime date;
    private double price;
    private final String type;
    private State state;

    public SubscriptionPurchase(String client, String subType) {
        this.client = client;
        this.type = subType;
        this.state = new StartState(this);
    }

    public String getClient() {
        return client;
    }

    public LocalDateTime getDate() {
        date = state.getDate();
        return date;
    }

    public double getPrice() {
        price = state.getPrice();
        return price;
    }

    public String getType() {
        return type;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void changeState() {
        this.state.changeState();
    }

    @Override
    public String toString() {
        return "SubscriptionPurchase{" +
                "client='" + client + '\'' +
                ", date=" + date +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", state=" + state +
                '}';
    }
}
