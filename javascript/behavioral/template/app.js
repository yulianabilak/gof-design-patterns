import { SkiRental, SnowboardRental } from "./rental.js";
import { EquipmentService } from "./service.js";

const equipmentService = new EquipmentService();
let rental = new SkiRental(equipmentService);
if (rental.rent()) {
    console.log("Ski rental success");
}
else {
    console.log("Couldn't rent");
}
console.log("=================================================================");
rental = new SnowboardRental(equipmentService);
if (rental.rent()) {
    console.log("Snowboard rental success");
}
else {
    console.log("Couldn't rent");
}