package com.bilak.domain;

import java.time.LocalDateTime;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Pass
 * @since 10/16/2022 - 16.54
 **/
public class Pass {
    private Integer id;
    private Subscription subscription;
    private LocalDateTime date;

    public Pass(Integer id, Subscription subscription, LocalDateTime date) {
        this.id = id;
        this.subscription = subscription;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Subscription getSubscription() {
        return subscription;
    }

    public void setSubscription(Subscription subscription) {
        this.subscription = subscription;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Pass{" +
                "id=" + id +
                ", subscription=" + subscription +
                ", date=" + date +
                '}';
    }
}
