import { ReportGeneratorProxy } from "./proxy.js";

const proxy = new ReportGeneratorProxy("USER");
proxy.displayStatisticalReport();
console.log();
proxy.displaySensitiveReport();