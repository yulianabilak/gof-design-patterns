import promptSync from 'prompt-sync';
const prompt = promptSync();

export class Client {
    constructor(name, phone, document) {
        this.name = name;
        this.phone = phone;
        this.document = document;
    }
}

export class EquipmentRental {
    constructor(equipmentService) {
        if (this.constructor == EquipmentRental) {
            throw new Error("Abstract classes can't be instantiated.");
        }
        this.equipmentService = equipmentService;
    }

    rent() {
        const client = this.collectInfo();
        if (client) {
            console.log("\nBegin equipment selection process");
            const category = prompt("Enter equipment category: ");
            const height = prompt("Enter height of the client: ");
            const equipmentToRent = this.findEquipment(height, category);
            if (equipmentToRent) {
                this.pay(equipmentToRent.basePrice, client);
                console.log("Payment completed");
                console.log(`${client.name} rented ${equipmentToRent.name} at ${new Date().toISOString()}`);
                return true;
            }
        }
        return false;
    }

    collectInfo() {
        const name = prompt("Enter name of the client: ");
        const phone = prompt("Enter phone number of the client: ");
        const document = prompt("Enter number of identifying document of the client: ");

        if (name === "" || phone === "" || document === "") {
            return null;
        }

        return new Client(name, phone, document);
    }

    findEquipment(height, category) {
        throw new Error("Method 'findEquipment()' must be implemented.");
    }

    pay(priceToPay, client) {
        const dayOfWeek = new Date().getDay();
        if (dayOfWeek === 0 || dayOfWeek === 6) {
            priceToPay *= 1.05;
        }
        console.log(`Withdrawing ${priceToPay} UAH from client's ${client.name} bank account...`);
    }
}

export class SkiRental extends EquipmentRental {
    constructor(equipmentService) {
        super(equipmentService);
    }

    findEquipment(height, category) {
        return this.equipmentService.findSkis(height, category);
    }
}

export class SnowboardRental extends EquipmentRental {
    constructor(equipmentService) {
        super(equipmentService);
    }

    findEquipment(height, category) {
        return this.equipmentService.findSnowboard(height, category);
    }
}