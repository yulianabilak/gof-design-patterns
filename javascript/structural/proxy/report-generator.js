import { Pass } from "./domain.js";
import { Subscription } from "./domain.js";

export class ReportGenerator {
    constructor() {
        this.passes = [
            new Pass(1, new Subscription(3, "Yuliana Bilak", "timed", 500.5, new Date()), new Date()),
            new Pass(2, new Subscription(3, "Yuliana Bilak", "timed", 500.5,new Date()), new Date()),
            new Pass(3, new Subscription(3, "Yuliana Bilak", "timed", 500.5, new Date()), new Date()),
            new Pass(4, new Subscription(2, "Bilak", "timed", 500.5, new Date()), new Date()),
            new Pass(5, new Subscription(2, "Bilak", "timed", 500.5, new Date()), new Date())
        ];
    }

    displayStatisticalReport() {
        const ids = this.passes.map(el => el.subscription.id);
        const idWithMaxPasses = ids.sort((a, b) => ids.filter(el => el === a).length - ids.filter(el => el === b).length).reverse().at(0);

        console.log(`Number of passes from all time: ${this.passes.length}`);
        console.log(`Most passes are from subscription #${idWithMaxPasses}`);
    }

    displaySensitiveReport() {
        console.log(this.passes);
    }
}