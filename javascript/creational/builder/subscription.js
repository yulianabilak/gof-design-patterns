class Subscription {
    constructor() {
        this.id = '';
        this.client = null;
        this.type = '';
        this.issuedBy = null;
        this.price = 0;
        this.discount = 0;
        this.sellDate = null;
        this.startDate = null;
        this.endDate = null;
        this.passesLeft = null;
    }
}

class SubscriptionBuilder {
    constructor() {
        this.subscription = new Subscription();
    }

    setId(id) {
        this.subscription.id = id;
        return this;
    }

    setClient(client) {
        this.subscription.client = client;
        return this;
    }

    setType(type) {
        this.subscription.type = type;
        return this;
    }

    setIssuedBy(worker) {
        this.subscription.issuedBy = worker;
        return this;
    }

    setPrice(price) {
        this.subscription.price = price;
        return this;
    }

    setDiscount(discount) {
        this.subscription.discount = discount;
        return this;
    }

    setSellDate(date) {
        this.subscription.sellDate = date;
        return this;
    }

    setStartDate(date) {
        this.subscription.startDate = date;
        return this;
    }

    setEndDate(date) {
        this.subscription.endDate = date;
        return this;
    }

    setPassesLeft(passes) {
        this.subscription.passesLeft = passes;
        return this;
    }

    build() {
        return this.subscription;
    }
}

export default SubscriptionBuilder;