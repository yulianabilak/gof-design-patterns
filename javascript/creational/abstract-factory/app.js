import { StandardSubscriptionFactory } from "./factories.js";
import { VipSubscriptionFactory } from "./factories.js";

const category = "standard";
let factory, passSubscription, timedSubscription, unlimitedSubscription;
if (category == "standard") {
    factory = new StandardSubscriptionFactory();
    passSubscription = factory.createPassSubscription(23, new Date());
    timedSubscription = factory.createTimedSubscription(new Date(2022, 11, 12, 9, 45, 0), 
    new Date(2022, 11, 19, 11, 11, 0));
    unlimitedSubscription = factory.createUnlimitedSubscription(new Date(2022, 0, 10, 8, 2, 0));
}
else if (category == "vip") {
    factory = new VipSubscriptionFactory();
    passSubscription = factory.createPassSubscription(23, new Date());
    timedSubscription = factory.createTimedSubscription(new Date(2022, 11, 12, 9, 45, 0), 
    new Date(2022, 11, 19, 11, 11, 0));
    unlimitedSubscription = factory.createUnlimitedSubscription(new Date(2022, 0, 10, 8, 2, 0));
}
else throw new Error("Wrong category type.");
console.log(passSubscription, passSubscription.getPrice());
console.log(timedSubscription, timedSubscription.getPrice());
console.log(unlimitedSubscription, unlimitedSubscription.getPrice());