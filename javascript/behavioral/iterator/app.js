class Equipment {
    constructor(name, category, price, inStock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.inStock = inStock;
    }
}

class EquipmentCollection {
    constructor() {
        this.list = [];
    }

    addEquipment(equipment) {
        this.list.push(equipment);
    }

    removeEquipment(equipment) {
        this.list = this.list.filter(eq => eq !== equipment);
    }

    inStockIterator() {
        return new EquipmentInStockIterator(this.list);
    }

    notInStockIterator() {
        return new EquipmentNotInStockIterator(this.list);
    }
}

class EquipmentInStockIterator {
    constructor(equipmentList) {
        this.list = equipmentList;
        this.position = 0;
    }

    hasNext() {
        while(this.position < this.list.length) {
            const equipment = this.list[this.position];
            if (equipment.inStock) {
                return true;
            }
            else this.position++;
        }
        return false;
    }

    next() {
        const equipment = this.list[this.position];
        this.position++;
        return equipment;
    }
}

class EquipmentNotInStockIterator {
    constructor(equipmentList) {
        this.list = equipmentList;
        this.position = 0;
    }

    hasNext() {
        while(this.position < this.list.length) {
            const equipment = this.list[this.position];
            if (!equipment.inStock) {
                return true;
            }
            else this.position++;
        }
        return false;
    }

    next() {
        const equipment = this.list[this.position];
        this.position++;
        return equipment;
    }
}

//=====================================================================
const collection = new EquipmentCollection();
collection.addEquipment(new Equipment("Ski set", "A", 100, true));
collection.addEquipment(new Equipment("Ski set", "B", 100, false));
collection.addEquipment(new Equipment("Snowboard set", "A", 100, true));
collection.addEquipment(new Equipment("Snowboard set", "B", 100, true));
collection.addEquipment(new Equipment("Snowboard set", "C", 100, false));

const inStockIterator = collection.inStockIterator();
while (inStockIterator.hasNext()) {
    console.log(inStockIterator.next());
}
console.log("=========================================");
const notInStockIterator = collection.notInStockIterator();
while (notInStockIterator.hasNext()) {
    console.log(notInStockIterator.next());
}