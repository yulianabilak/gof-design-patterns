package com.bilak.structural.bridge.abstraction;

import com.bilak.structural.bridge.implementation.Queue;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class TimedSubscription
 * @since 10/2/2022 - 19.24
 **/
public class TimedSubscription extends Subscription {
    private LocalDate startDate;
    private LocalDate endDate;

    public TimedSubscription(Integer id, String client, Double price, LocalDateTime sellDate, Queue queue, LocalDate startDate, LocalDate endDate) {
        super(id, client, price, sellDate, queue);
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public void pass() {
        if (LocalDate.now().isAfter(startDate) && LocalDate.now().isBefore(endDate)) {
            System.out.println("Recorded pass from Subscription(timed) #" + id);
            queue.pass(client);
        }
        else System.out.println("Client with Subscription #" + id + " is not allowed to pass with out of date subscription");
    }

    @Override
    public Double getPrice() {
        return null;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
