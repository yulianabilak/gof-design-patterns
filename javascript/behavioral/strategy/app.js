import { Client, Queue } from "./context.js";
import { StandardStrategy, VipStrategy } from "./strategies.js";

const clients = [
    new Client("1", "STANDARD"),
    new Client("2", "STANDARD"),
    new Client("3", "VIP"),
    new Client("4", "VIP"),
    new Client("5", "STANDARD"), 
];
let strategy;
const queue = new Queue(2, null);
clients.forEach(client => {
    if (client.status === "STANDARD") {
        strategy = new StandardStrategy();
    }
    else if (client.status === "VIP") {
        strategy = new VipStrategy();
    }
    queue.strategy = strategy;
    queue.pass(client);
});
console.log(queue.queue);