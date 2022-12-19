import { SubscriptionPurchase } from "./context.js";

const purchase = new SubscriptionPurchase("Yuliana Bilak", "timed");
console.log("Price: " + purchase.getPrice());
console.log("Date: " + purchase.getDate());

purchase.changeState();
console.log("Price: " + purchase.getPrice());
console.log("Date: " + purchase.getDate());

console.log();
console.log(purchase);