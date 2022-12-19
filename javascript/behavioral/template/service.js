export class Equipment {
    constructor(name, category, basePrice, length) {
        this.name = name;
        this.category = category;
        this.basePrice = basePrice;
        this.length = length;
    }
}

export class EquipmentService {
    availableEquipment = [
        new Equipment("Ski set", "A", 100, 175),
        new Equipment("Ski set", "A", 100.0,  160),
        new Equipment("Ski set", "B",  50.0, 175),
        new Equipment("Ski set", "C", 40.0, 160),
        new Equipment("Ski set", "D1",  30.0, 110),
        new Equipment("Ski set", "D2",  20.0, 110),
        new Equipment("Snowboard set", "A", 90.0, 147),
        new Equipment("Snowboard set", "C",  80.0, 135),
        new Equipment("Snowboard set", "D2",  15.0, 110)
    ];

    findSkis(height, category) {
        let equipment;
        if (height >= 165 && height <= 178) {
            equipment = this.availableEquipment.find(eq => eq.name === "Ski set" && eq.category === category && eq.length === 175);
        }
        else if (height >= 158 && height < 165) {
            equipment = this.availableEquipment.find(eq => eq.name === "Ski set" && eq.category === category && eq.length === 160);
        }
        else if (height >= 127 && height <= 135) {
            equipment = this.availableEquipment.find(eq => eq.name === "Ski set" && eq.category === category && eq.length === 110);
        }
        return equipment;
    }

    findSnowboard(height, category) {
        let equipment;
        if (height >= 152 && height <= 173) {
            equipment = this.availableEquipment.find(eq => eq.name === "Snowboard set" && eq.category === category && eq.length === 147);
        }
        else if (height >= 152 && height < 163) {
            equipment = this.availableEquipment.find(eq => eq.name === "Snowboard set" && eq.category === category && eq.length === 135);
        }
        else if (height >= 125 && height <= 135) {
            equipment = this.availableEquipment.find(eq => eq.name === "Snowboard set" && eq.category === category && eq.length === 110);
        }
        return equipment;
    }
}