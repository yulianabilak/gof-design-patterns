const BASE_PRICE_PER_DAY = 600;
const BASE_PRICE_PER_HOUR = 50.5;
const BASE_PRICE_PER_PASS = 46.2;
const BASE_PRICE_UNLIMITED = 120000;

export class StandardPassSubscription {
    constructor(passes, dateFrom, dateTo) {
        this.passes = passes;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    getPrice() {
        return BASE_PRICE_PER_PASS * this.passes;
    }
}

export class VipPassSubscription {
    constructor(passes, dateFrom, dateTo) {
        this.passes = passes;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    getPrice() {
        return BASE_PRICE_PER_PASS * this.passes * 2;
    }
}

export class StandardTimedSubscription {
    constructor(dateFrom, dateTo) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    getPrice() {
        let price = 0;
        const oneDay = 1000 * 60 * 60 * 24;
        let diff = this.dateTo.getTime() - this.dateFrom.getTime();
        const days = Math.round(diff / oneDay);
        if (days !== 0) {
            price = BASE_PRICE_PER_DAY * days;
        }
        const oneHour = 1000 * 60 * 60;
        const lastDay = new Date(new Date(this.dateFrom).setDate(this.dateFrom.getDate() + days));
        diff = this.dateTo.getTime() - lastDay.getTime();
        const hours = Math.round(diff / oneHour);
        price += BASE_PRICE_PER_HOUR * hours;
        return price;
    }
}

export class VipTimedSubscription {
    constructor(dateFrom, dateTo) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    getPrice() {
        let price = 0;
        const oneDay = 1000 * 60 * 60 * 24;
        let diff = this.dateTo.getTime() - this.dateFrom.getTime();
        const days = Math.round(diff / oneDay);
        if (days !== 0) {
            price = BASE_PRICE_PER_DAY * days * 2;
        }
        const oneHour = 1000 * 60 * 60;
        const lastDay = new Date(new Date(this.dateFrom).setDate(this.dateFrom.getDate() + days));
        diff = this.dateTo.getTime() - lastDay.getTime();
        const hours = Math.round(diff / oneHour);
        price += BASE_PRICE_PER_HOUR * hours * 2;
        return price;
    }
}

export class StandardUnlimitedSubscription {
    constructor(dateFrom, dateTo) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    getPrice() {
        return BASE_PRICE_UNLIMITED;
    }
}

export class VipUnlimitedSubscription {
    constructor(dateFrom, dateTo) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
    }

    getPrice() {
        return BASE_PRICE_UNLIMITED * 2;
    }
}