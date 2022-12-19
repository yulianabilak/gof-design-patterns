import { Client } from "./domain.js";
import { RentalFacade } from "./rental-facade.js";

const client = new Client("Yuliana Bilak", "00000000", 172);
const facade = new RentalFacade();
if (facade.makeRental(client, "ski", "C")) {
    console.log("Rental successfully fulfilled.");
}
else console.log("Couldn't make rental.");