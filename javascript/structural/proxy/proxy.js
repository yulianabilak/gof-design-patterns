import { ReportGenerator } from "./report-generator.js";

export class ReportGeneratorProxy {
    constructor(role) {
        this.accessRole = role;
    }

    displayStatisticalReport() {
        if (!this.reportGenerator) {
            this.reportGenerator = new ReportGenerator();
        }
        this.reportGenerator.displayStatisticalReport();
    }

    displaySensitiveReport() {
        if (this.accessRole === "ADMIN") {
            if (!this.reportGenerator) {
                this.reportGenerator = new ReportGenerator();
            }
            this.reportGenerator.displaySensitiveReport();
        }
        else {
            console.error("You don't have rights to view sensitive report.");
        }
    }
}