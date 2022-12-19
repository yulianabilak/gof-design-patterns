class Equipment {
    constructor(name, category, price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }
}

class EquipmentManager {
    constructor() {
        this.equipment = new Map();
    }

    getAllEquipment() {
        return this.equipment;
    }

    saveEquipment(eq, quantity) {
        if (eq && this.equipment.get(eq) === 0) {
            eq.isInStock = true;
        }
        this.equipment.set(eq, quantity);
    }

    saveState() {
        return new EquipmentManagerState(new Map(this.equipment));
    }

    restore(state) {
        this.equipment = state.equipment;
    }
}

class EquipmentManagerState {
    constructor(equipment) {
        this.equipment = equipment;
    }
}

class History {
    constructor() {
        this.mementoList = [];
    }

    add(state) {
        this.mementoList.push(state);
    }

    get() {
        return this.mementoList[this.mementoList.length-1];
    }
}
//======================================================================
const originator = new EquipmentManager();
const history = new History();

originator.saveEquipment(new Equipment("Ski set", "A", 100), 5);
history.add(originator.saveState());
originator.saveEquipment(new Equipment("Ski set", "B", 100), 15);
history.add(originator.saveState());
originator.saveEquipment(new Equipment("Ski set", "C", 100), 10);
console.log(originator.getAllEquipment());
originator.restore(history.get());
console.log(originator.getAllEquipment());