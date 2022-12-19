import Client from "./client.js";
import Worker from "./worker.js";
import SubscriptionBuilder from "./subscription.js";

const client = new Client('Yuliana Bilak', new Date(2003, 0, 2), '+38972863687');
const worker = new Worker('Olena Petryk', 'administrator');

const subscription = new SubscriptionBuilder().setClient(client).setDiscount(0.02).setEndDate(new Date()).setId(1).setPrice(500).build();
console.log(subscription);