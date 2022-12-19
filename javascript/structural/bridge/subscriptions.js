class Subscription {
    constructor(id, client, price, sellDate, queue) {
        if (this.constructor == Subscription) {
            throw new Error("Abstract classes can't be instantiated.");
        }
        this.id = id;
        this.client = client;
        this.price = price;
        this.sellDate = sellDate;
        this.queue = queue;
    }

    pass() {
        throw new Error("Method 'pass()' must be implemented.");
    }
}

export class PassSubscription extends Subscription {
    constructor(id, client, price, sellDate, queue, passes) {
        super(id, client, price, sellDate, queue);
        this.passes = passes;
    }

    pass() {
        this.passes = this.passes - 1;
        if (this.passes !== 0) {
            console.log("Recorded pass from Subscription(pass) #" + this.id);
            this.queue.pass(this.client);
        }
        else console.error("Client with Subscription #" + this.id + " is not allowed to pass with 0 passes");
    }
}

export class TimedSubscription extends Subscription {
    constructor(id, client, price, sellDate, queue, startDate, endDate) {
        super(id, client, price, sellDate, queue);
        this.startDate = startDate;
        this.endDate = endDate;
    }

    pass() {
        const currentDate = new Date();
        if (currentDate >= this.startDate && currentDate <= this.endDate) {
            console.log("Recorded pass from Subscription(timed) #" + this.id);
            this.queue.pass(this.client);
        }
        else console.error("Client with Subscription #" + this.id + " is not allowed to pass with out of date subscription");
    }
}