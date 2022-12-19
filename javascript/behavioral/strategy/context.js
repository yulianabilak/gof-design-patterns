export class Client {
    constructor(name, status) {
        this.name = name;
        this.status = status;
    }
}

export class Queue {
    constructor(lift, strategy) {
        this.lift = lift;
        this.strategy = strategy;
        this.queue = [];
    }

    pass(client) {
        this.strategy.pass(client, this.queue);
    }
}