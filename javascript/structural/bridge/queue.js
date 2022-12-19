export class StandardQueue {
    constructor(lift) {
        this.standardPasses = [];
        this.lift = lift;
    }

    pass(client) {
        this.standardPasses.push(`Client: ${client} passed from standard queue at ${new Date().toUTCString()}`);
    }
}

export class VipQueue {
    constructor(lift) {
        this.vipPasses = [];
        this.lift = lift;
    }

    pass(client) {
        this.vipPasses.push(`Client: ${client} passed from vip queue at ${new Date().toUTCString()}`);
    }
}