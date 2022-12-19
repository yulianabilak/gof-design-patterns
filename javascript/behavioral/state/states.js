class State {
    constructor(purchase) {
        if (this.constructor == State) {
            throw new Error("Abstract classes can't be instantiated.");
        }
        this.purchase = purchase;
    }

    changeState() {
        throw new Error("Method 'changeState()' must be implemented.");
    }

    getDate() {
        throw new Error("Method 'getDate()' must be implemented.");
    }

    getPrice() {
        throw new Error("Method 'getPrice()' must be implemented.");
    }
}

export class StartState extends State {
    constructor(purchase) {
        super(purchase);
    }

    changeState() {
        this.purchase.state = new PayingState(this.purchase);
    }

    getDate() {
        console.log("START STATE: No date yet");
        return null;
    }

    getPrice() {
        console.log("START STATE: No price yet");
        return 0;
    }
}

export class PayingState extends State {
    constructor(purchase) {
        super(purchase);
    }

    changeState() {
        console.log("This is the final state. No more changes");
    }

    getDate() {
        return new Date();
    }

    getPrice() {
        console.log("PAYING STATE: Payment is being processed right now");
        switch (this.purchase.type) {
            case "timed":
                return 50.5;
            case "pased":
                return 70.7;
            case "unlimited":
                return 30000;
            default:
                console.error("Error. Unknown type");
                this.purchase.state = new ErrorState(this.purchase);
                return 0;
        }
    }
}

export class ErrorState extends State {
    constructor(purchase) {
        super(purchase);
    }

    changeState() {
        console.log("There was some error. This will be the last state then");
    }

    getDate() {
        console.log("ERROR STATE: Date of error: " + new Date());
        return null;
    }

    getPrice() {
        return 0;
    }
}