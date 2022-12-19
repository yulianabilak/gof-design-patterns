import { EquipmentService } from "./equipment-service.js";
import { PaymentService } from "./payment-service.js";
import { RentalService } from "./rental-service.js";

export class RentalFacade {
    constructor() {
        this.equipmentService = new EquipmentService();
        this.paymentService = new PaymentService();
        this.rentalService = new RentalService();
    }

    makeRental(client, equipmentType, category) {
        let rentalFulfilled = false;
        const eqForRent = this.equipmentService.findEquipment(client.height, equipmentType, category);
        if (eqForRent) {
            console.log(`Equipment ${eqForRent.name} ${eqForRent.category} is available.`);
            if (this.paymentService.makePayment(eqForRent.basePrice, client)) {
                console.log("Payment confirmed.");
                this.rentalService.add(`Rental at ${new Date().toISOString()} for client ${client} with equipment ${eqForRent}`);
                rentalFulfilled = true;
            }
        }
        return rentalFulfilled;
    }
}