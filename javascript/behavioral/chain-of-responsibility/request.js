export class Client {
    constructor(name, dateOfBirth, benefit) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.benefit = benefit;
    }
}

export class SubscriptionPurchaseRequest {
    constructor(client, type, sellDate, price) {
        this.client = client;
        this.type = type;
        this.sellDate = sellDate;
        this.price = price;
    }
}