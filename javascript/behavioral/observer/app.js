class Equipment {
    constructor(name, category, inStock, price) {
        this.name = name;
        this.category = category;
        this.inStock = inStock;
        this.price = price;
    }
}

class Client {
    constructor(name, email) {
        this.name = name;
        this.email = email;
    }

    update(eqName, eqCategory) {
        console.log(`Hello, ${this.name}! Equipment ${eqName} ${eqCategory} just got restocked.`);
    }
}

class NotificationChannel {
    constructor() {
        this.subscribers = [];
    }

    subscribe(subscriber) {
        this.subscribers.push(subscriber);
    }

    unsubscribe(subscriber) {
        this.subscribers = this.subscribers.filter(sub => sub !== subscriber);
    }

    notifyAll(eqName, eqCategory) {
        this.subscribers.forEach(sub => sub.update(eqName, eqCategory));
    }
}

class RentalStation {
    constructor(publisher) {
        this.equipment = new Map();
        this.publisher = publisher;
    }

    saveEquipment(equipment, quantity) {
        console.log("Saving equipment...\n");
        this.equipment.set(equipment, quantity);
        this.publisher.notifyAll(equipment.name, equipment.category);
    }
}
//===========================================================================
const rentalStation = new RentalStation(new NotificationChannel());
const equipment1 = new Equipment("Ski set", "A", false, 100);
const equipment2 = new Equipment("Ski set", "B", false, 60);
rentalStation.saveEquipment(equipment1, 0);
rentalStation.saveEquipment(equipment2, 0);

const client1 = new Client("April", "dgjhgdhg@gmail.com");
const client2 = new Client("Mary", "dhdjjdsgh@gmail.com");
rentalStation.publisher.subscribe(client1);
rentalStation.publisher.subscribe(client2);

rentalStation.saveEquipment(equipment1, 3);
rentalStation.saveEquipment(equipment2, 4);