import { StandardPassSubscription } from "./subscriptions.js";
import { StandardTimedSubscription } from "./subscriptions.js";
import { StandardUnlimitedSubscription } from "./subscriptions.js";

import { VipPassSubscription } from "./subscriptions.js";
import { VipTimedSubscription } from "./subscriptions.js";
import { VipUnlimitedSubscription } from "./subscriptions.js";

export class SubscriptionFactory {
    constructor() {
        if (this.constructor == SubscriptionFactory) {
            throw new Error("Abstract classes can't be instantiated.");
        }
    }

    createPassSubscription(passes, dateFrom) {
        throw new Error("Method 'createPassSubscription()' must be implemented.");
    }

    createTimedSubscription(from, to) {
        throw new Error("Method 'createTimedSubscription()' must be implemented.");
    }

    createUnlimitedSubscription(datefrom) {
        throw new Error("Method 'createUnlimitedSubscription()' must be implemented.");
    }
}

export class StandardSubscriptionFactory extends SubscriptionFactory {
    createPassSubscription(passes, dateFrom) {
        if (passes <= 0) {
            throw new Error("Passes can't be less than 0.");
        }
        const date = new Date(dateFrom);
        return new StandardPassSubscription(passes, dateFrom, new Date(date.setDate(date.getDate() + 1)));
    }

    createTimedSubscription(from, to) {
        if (from > to) {
            throw new Error("Start date can't be later than the end date.");
        }
        return new StandardTimedSubscription(from, to);
    }

    createUnlimitedSubscription(from) {
        let to;
        if (from < new Date(from.getYear(), 4, 1)) {
            to = new Date(from.getYear(), 4, 1);
        }
        else {
            to = new Date(from.getYear()+1, 4, 1);
        }
        return new StandardUnlimitedSubscription(from, to);
    }
}

export class VipSubscriptionFactory extends SubscriptionFactory {
    createPassSubscription(passes, dateFrom) {
        if (passes <= 0) {
            throw new Error("Passes can't be less than 0.");
        }
        const date = new Date(dateFrom);
        return new VipPassSubscription(passes, dateFrom, new Date(date.setDate(date.getDate() + 1)));
    }

    createTimedSubscription(from, to) {
        if (from > to) {
            throw new Error("Start date can't be later than the end date.");
        }
        return new VipTimedSubscription(from, to);
    }

    createUnlimitedSubscription(datefrom) {
        let to;
        if (from < new Date(from.getYear(), 4, 1)) {
            to = new Date(from.getYear(), 4, 1);
        }
        else {
            to = new Date(from.getYear()+1, 4, 1);
        }
        return new VipUnlimitedSubscription(from, to);
    }
}