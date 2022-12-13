package com.bilak.domain;

import java.time.LocalDateTime;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Subscription
 * @since 10/1/2022 - 18.19
 **/
public class Subscription {
    private Integer id;
    private String client;
    private String type;
    private Double price;
    private LocalDateTime sellDate;

    public Subscription(Integer id, String client, String type, Double price, LocalDateTime sellDate) {
        this.id = id;
        this.client = client;
        this.type = type;
        this.price = price;
        this.sellDate = sellDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDateTime getSellDate() {
        return sellDate;
    }

    public void setSellDate(LocalDateTime sellDate) {
        this.sellDate = sellDate;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "id=" + id +
                ", client='" + client + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", sellDate=" + sellDate +
                '}';
    }
}