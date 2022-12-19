class Subscription {
    constructor(id, client, type, price, sellDate) {
        this.id = id;
        this.client = client;
        this.type = type;
        this.price = price;
        this.sellDate = sellDate;
    }
}

class UIService {
    constructor() {
        if (this.constructor == UIService) {
            throw new Error("Abstract classes can't be instaintiated.");
        }
    }

    displayReceipt(subscription) {
        throw new Error("Method 'displayReceipt()' must be implemented.");
    }
}

class SkiResortUIService extends UIService {
    displayReceipt(subscription) {
        console.log(subscription);
    }
}

class UIServiceDecorator extends UIService {
    constructor(decoratedService) {
        super();
        if (this.constructor == UIServiceDecorator) {
            throw new Error("Abstract classes can't be instaintiated.");
        }
        this.decoratedService = decoratedService;
    }

    displayReceipt(subscription) {
        this.decoratedService.displayReceipt(subscription);
    }
}

class LightThemeUIServiceDecorator extends UIServiceDecorator {
    constructor(decoratedService) {
        super(decoratedService);
    }

    displayReceipt(subscription) {
        super.displayReceipt(subscription);
        console.log("Style{fontSize: 16px; color: black; background: white; fontWeight: bold}");
    }
}

class DarkThemeUIServiceDecorator extends UIServiceDecorator {
    constructor(decoratedService) {
        super(decoratedService);
    }

    displayReceipt(subscription) {
        super.displayReceipt(subscription);
        console.log("Style{fontSize: 16px; color: white; background: black; fontWeight: bold}");
    }
}

const subscription = new Subscription(1, "Yuliana Bilak", "timed", 99.9, new Date());

const skiResortUIService = new SkiResortUIService();
const lightThemeUIService = new LightThemeUIServiceDecorator(skiResortUIService);
const darkThemeUIService = new DarkThemeUIServiceDecorator(skiResortUIService);

console.log("Receipt displayed in ordinary theme: ");
skiResortUIService.displayReceipt(subscription);
console.log("==============================================================");

console.log("Receipt displayed in light theme: ");
lightThemeUIService.displayReceipt(subscription);
console.log("==============================================================");

console.log("Receipt displayed in dark theme: ");
darkThemeUIService.displayReceipt(subscription);
console.log("==============================================================");