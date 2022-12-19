export class RentalService {
    rentals = [];

    add(record) {
        this.rentals.push(record);
    }

    getRentals() {
        return this.rentals;
    }
}