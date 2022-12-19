import { EquipmentRemoveOperation, EquipmentSaveOperation, RentalStation } from "./commands.js";
import { EquipmentOperationExecutor } from "./invoker.js";

class Equipment {
    constructor(name, category, price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }
}

const equipmentSet = new Map();
equipmentSet.set(new Equipment("Ski set", "A", 100), 200);
equipmentSet.set(new Equipment("Ski set", "B", 50), 100);
const rentalStation = new RentalStation(equipmentSet);
const equipmentOperationExecutor = new EquipmentOperationExecutor();

const equipment = new Equipment("Snowboard set", "C", 30);
equipmentOperationExecutor.executeOperation(new EquipmentSaveOperation(rentalStation, equipment, 8));
equipmentOperationExecutor.executeOperation(new EquipmentRemoveOperation(rentalStation, equipment));
console.log("================================================================");
console.log("Command history");
console.log(equipmentOperationExecutor.equipmentOperations);