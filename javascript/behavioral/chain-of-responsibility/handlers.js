class DiscountHandler {
    constructor() {
        if (this.constructor == DiscountHandler) {
            throw new Error("Abstract classes can't be instantiated.");
        }
    }

    setNextHandler(nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }

    getDiscount(request) {
        if (this.nextHandler) {
            return this.nextHandler.getDiscount(request);
        }
        else {
            return 0;
        }
    }
}

export class AgeDiscountHandler extends DiscountHandler {
    getDiscount(request) {
        let result = 0;
        const clientBirthDate = request.client.birthDate;
        const now = new Date();
        if (clientBirthDate > new Date().setFullYear(now.getFullYear() - 10) || clientBirthDate < new Date().setFullYear(now.getFullYear - 60)) {
            console.log("Applying discount for age...");
            result = 0.05;
        }
        return result + super.getDiscount(request);
    }
}

export class DateDiscountHandler extends DiscountHandler {
    getDiscount(request) {
        let result = 0;
        const sellDate = request.sellDate;
        if (sellDate < new Date(sellDate.getFullYear(), 3, 1) && sellDate > new Date(sellDate.getFullYear(), 1, 25)) {
            console.log("Applying discount for date...");
            result = 0.03;
        }
        return result + super.getDiscount(request);
    }
}

export class BenefitDiscountHandler extends DiscountHandler {
    getDiscount(request) {
        let result = 0;
        if (request.client.benefit) {
            console.log("Applying discount for benefit...");
            result = 0.1;
        }
        return result + super.getDiscount(request); 
    }
}