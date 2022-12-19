import { StandardQueue, VipQueue } from "./queue.js";
import { PassSubscription, TimedSubscription } from "./subscriptions.js";

function testPass(queue) {
    console.log("Test pass subscription\n");
    const sub1 = new PassSubscription(1, "Yuliana Bilak", 500.5, new Date(2022, 8, 30), queue, 20);
    sub1.pass();

    console.log("\nTest timed subscription\n");
    const start = new Date(2022, 8, 30);
    const end = new Date(2022, 9, 5);
    const sub2 = new TimedSubscription(2, "Bilak Yuliana", 300.6, new Date(2022, 8, 30), queue, start, end);
    sub2.pass();

    console.log("");
    console.log(queue);
}

testPass(new StandardQueue(4));
testPass(new VipQueue(4));