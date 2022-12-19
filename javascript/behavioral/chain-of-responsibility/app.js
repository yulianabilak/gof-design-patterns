import { Client } from "./request.js";
import { SubscriptionPurchaseRequest } from "./request.js";

import { AgeDiscountHandler } from "./handlers.js";
import { DateDiscountHandler } from "./handlers.js";
import { BenefitDiscountHandler } from "./handlers.js";

const client = new Client("Blanche Fallowes", new Date(2003, 1, 2), "low-income");
const request = new SubscriptionPurchaseRequest(client, "timed", new Date(2022, 2, 24), 500);

const ageDiscountHandler = new AgeDiscountHandler();
const dateDiscountHandler = new DateDiscountHandler();
const benefitDiscountHandler = new BenefitDiscountHandler();

ageDiscountHandler.setNextHandler(benefitDiscountHandler).setNextHandler(dateDiscountHandler);

console.log("Chain: Age -> Benefit -> Date");
let discount = ageDiscountHandler.getDiscount(request);
console.log("\nDiscount: ", discount);

console.log("\nChain: Benefit -> Date");
discount = benefitDiscountHandler.getDiscount(request);
console.log("\nDiscount: ", discount);