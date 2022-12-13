package com.bilak.behavioral.chainofresp.request;

import java.time.LocalDateTime;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class SubscriptionPurchaseRequest
 * @since 11/5/2022 - 15.22
 **/
public class SubscriptionPurchaseRequest {
    private Client client;
    private String type;
    private LocalDateTime sellDate;
    private double price;

    public SubscriptionPurchaseRequest(Client client, String type, LocalDateTime sellDate, double price) {
        this.client = client;
        this.type = type;
        this.sellDate = sellDate;
        this.price = price;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getSellDate() {
        return sellDate;
    }

    public void setSellDate(LocalDateTime sellDate) {
        this.sellDate = sellDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
