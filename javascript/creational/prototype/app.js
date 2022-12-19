import EquipmentPrototype from "./equipment-prototype.js";

const p1 = new EquipmentPrototype("Ski set", "A", true, 290);
const p2 = p1.clone();
console.log(p1, p2);
console.log(p1 === p2);
p2.category = "B";
console.log(p2);
console.log(p1);