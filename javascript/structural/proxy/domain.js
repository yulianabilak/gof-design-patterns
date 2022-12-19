export class Subscription {
    constructor(id, client, type, price, sellDate) {
        this.id = id;
        this.client = client;
        this.type = type;
        this.price = price;
        this.sellDate = sellDate;
    }
}

export class Pass {
    constructor(id, subscription, date) {
        this.id = id;
        this.subscription = subscription;
        this.date = date;
    }
}