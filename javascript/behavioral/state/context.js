import { StartState } from "./states.js";

export class SubscriptionPurchase {
    constructor(client, subtype) {
        this.client = client;
        this.date = null;
        this.price = 0;
        this.type = subtype;
        this.state = new StartState(this);
    }

    getDate() {
        this.date = this.state.getDate();
        return this.date;
    }

    getPrice() {
        this.price = this.state.getPrice();
        return this.price;
    }

    changeState() {
        this.state.changeState();
    }
}