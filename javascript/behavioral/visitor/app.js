import { Administrator, Instructor, Technician } from "./employees.js";
import { BonusVisitor } from "./visitor.js";

const bonusVisitor = new BonusVisitor();
const employees = [
    new Administrator("admin", 500),
    new Instructor("instructor", 500),
    new Technician("tech", 500)
];
employees.forEach(emp => emp.accept(bonusVisitor));
console.log(employees);