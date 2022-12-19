class EquipmentManager {
    constructor() {
        if (EquipmentManager.instance) {
            return EquipmentManager.instance;
        }
        EquipmentManager.instance = this;
        this.equipment = new Map();
        return this;
    }

    getAllEquipment() {
        console.log("Getting all available equipment...\n");
        return this.equipment;
    }

    saveEquipment(eq, quantity) {
        console.log("Saving equipment...\n");
        if (eq && this.equipment.get(eq) === 0) {
            eq.isInStock = true;
        }
        this.equipment.set(eq, quantity);
    }

    purchaseEquipment(eq) {
        console.log("Purchasing equipment...\n");
        if (this.equipment.get(eq) === 0) {
            eq.isInStock = false;
        }
        if (eq.isInStock) {
            this.equipment.set(eq, this.equipment.get(eq) - 1);
        }
        else {
            console.log("Your equipment is not in stock.");
        }
    }
}

export default EquipmentManager;