class EquipmentPrototype {
    constructor(name, category, inStock, price) {
        this.name = name;
        this.category = category;
        this.isInStock = inStock;
        this.price = price;
    }

    clone() {
        return new EquipmentPrototype(this.name, this.category, this.isInStock, this.price);
    }
}

export default EquipmentPrototype;