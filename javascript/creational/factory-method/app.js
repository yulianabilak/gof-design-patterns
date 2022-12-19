class SubscriptionFactory {
    constructor() {
        if (this.constructor === SubscriptionFactory) {
            throw new Error("Abstract classes can't be instantiated.");
        }
    }

    createSubscription() {
        throw new Error("Method 'createSubscription()' must be implemented.");
    }
}

class StandardSubscriptionFactory extends SubscriptionFactory {
    createSubscription(dateFrom, dateTo) {
        if (dateFrom > dateTo) {
            throw new Error("Start date can't be later than end date.");
        }
        return new StandardSubscription(dateFrom, dateTo);
    }
}

class VipSubscriptionFactory extends SubscriptionFactory {
    createSubscription(dateFrom, dateTo) {
        if (dateFrom > dateTo) {
            throw new Error("Start date can't be later than end date.");
        }
        return new VipSubscription(dateFrom, dateTo);
    }
}

class StandardSubscription {
    constructor(dateFrom, dateTo) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }
}

class VipSubscription {
    constructor(dateFrom, dateTo) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }
}

class LiftQueue {
    constructor(lift) {
        this.lift = lift;
        this.queue = [];
    }

    add(sub) {
        if (sub instanceof VipSubscription) {
            this.queue.forEach((el, index) => {
                if (el instanceof StandardSubscription) {
                    this.queue.splice(index, 0, sub);
                }
            })
        }
        else this.queue.push(sub);
    }

    remove() {
        this.queue.splice(this.queue.length-1, 1);
    }
}
//============================================================================================
const category = "vip";
let factory;
if (category === "standard") {
    factory = new StandardSubscriptionFactory();
}
else if (category === "vip") {
    factory = new VipSubscriptionFactory();
}
else throw new Error("Wrong category type.");
const sub1 = factory.createSubscription(new Date(2022, 11, 17), new Date(2022, 11, 18));
const sub2 = new StandardSubscription(new Date(2022,9,20), new Date(2022,9,21));
const queue = new LiftQueue(2);
queue.add(sub2);
queue.add(sub1);
console.log(queue);