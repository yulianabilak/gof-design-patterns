import EquipmentManager from "./equipment-manager.js";

const equipment = {
    name: "Ski set",
    category: "A",
    isInStock: true,
    price: 400
}

const equipmentManager1 = new EquipmentManager();
const equipmentManager2 = new EquipmentManager();

console.log(equipmentManager1.getAllEquipment());
equipmentManager1.saveEquipment(equipment, 100);
console.log(equipmentManager1.getAllEquipment());
console.log(equipmentManager2.getAllEquipment());
equipmentManager2.purchaseEquipment(equipment);
console.log(equipmentManager2.getAllEquipment());
console.log(equipmentManager1.getAllEquipment());

console.log(equipmentManager1 === equipmentManager2);