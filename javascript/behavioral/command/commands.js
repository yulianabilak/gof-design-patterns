export class RentalStation {
    constructor(equipment) {
        this.equipment = equipment;
    }

    saveEquipment(equipment, quantity) {
        console.log("Saving equipment...\n");
        this.equipment.set(equipment, quantity);
        console.log(this.equipment);
    }

    removeEquipment(equipment) {
        console.log("\nRemoving equipment...\n");
        this.equipment.delete(equipment);
        console.log(this.equipment);
    }
}

export class EquipmentSaveOperation {
    constructor(rentalStation, equipment, quantity) {
        this.rentalStation = rentalStation;
        this.equipment = equipment;
        this.quantity = quantity;
    }

    execute() {
        this.rentalStation.saveEquipment(this.equipment, this.quantity);
    }
}

export class EquipmentRemoveOperation {
    constructor(rentalStation, equipment) {
        this.rentalStation = rentalStation;
        this.equipment = equipment;
    }

    execute() {
        this.rentalStation.removeEquipment(this.equipment);
    }
}