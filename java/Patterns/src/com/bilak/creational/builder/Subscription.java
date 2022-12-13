package com.bilak.creational.builder;

import java.time.LocalDateTime;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Subscription
 * @since 9/24/2022 - 19.45
 **/
public class Subscription {
    private final Integer id;
    private final Client client;
    private final SubscriptionType type;
    private final Worker issuedBy;
    private final Double price;
    private final Double discount;
    private final LocalDateTime sellDate;
    private final LocalDateTime startDate;
    private final LocalDateTime endDate;
    private final Integer passesLeft;

    private Subscription(SubscriptionBuilder builder) {
        this.id = builder.id;
        this.client = builder.client;
        this.type = builder.type;
        this.issuedBy = builder.issuedBy;
        this.price = builder.price;
        this.discount = builder.discount;
        this.sellDate = builder.sellDate;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.passesLeft = builder.passesLeft;
    }

    public Integer getId() {
        return id;
    }

    public Client getClient() {
        return client;
    }

    public SubscriptionType getType() {
        return type;
    }

    public Worker getIssuedBy() {
        return issuedBy;
    }

    public Double getPrice() {
        return price;
    }

    public Double getDiscount() {
        return discount;
    }

    public LocalDateTime getSellDate() {
        return sellDate;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public Integer getPassesLeft() {
        return passesLeft;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "id=" + id +
                ", client=" + client +
                ", type=" + type +
                ", issuedBy=" + issuedBy +
                ", price=" + price +
                ", discount=" + discount +
                ", sellDate=" + sellDate +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", passesLeft=" + passesLeft +
                '}';
    }

    public static class SubscriptionBuilder {
        private Integer id;
        private Client client;
        private SubscriptionType type;
        private Worker issuedBy;
        private Double price;
        private Double discount;
        private LocalDateTime sellDate;
        private LocalDateTime startDate;
        private LocalDateTime endDate;
        private Integer passesLeft;

        public SubscriptionBuilder setId(Integer id) {
            this.id = id;
            return this;
        }

        public SubscriptionBuilder setClient(Client client) {
            this.client = client;
            return this;
        }

        public SubscriptionBuilder setType(SubscriptionType type) {
            this.type = type;
            return this;
        }

        public SubscriptionBuilder setIssuedBy(Worker issuedBy) {
            this.issuedBy = issuedBy;
            return this;
        }

        public SubscriptionBuilder setPrice(Double price) {
            this.price = price;
            return this;
        }

        public SubscriptionBuilder setDiscount(Double discount) {
            this.discount = discount;
            return this;
        }

        public SubscriptionBuilder setSellDate(LocalDateTime sellDate) {
            this.sellDate = sellDate;
            return this;
        }

        public SubscriptionBuilder setStartDate(LocalDateTime startDate) {
            this.startDate = startDate;
            return this;
        }

        public SubscriptionBuilder setEndDate(LocalDateTime endDate) {
            this.endDate = endDate;
            return this;
        }

        public SubscriptionBuilder setPassesLeft(Integer passesLeft) {
            this.passesLeft = passesLeft;
            return this;
        }

        public Subscription build() {
            return new Subscription(this);
        }
    }
}
