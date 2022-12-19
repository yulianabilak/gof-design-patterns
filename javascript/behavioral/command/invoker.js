export class EquipmentOperationExecutor {
    constructor() {
        this.equipmentOperations = [];
    }

    executeOperation(equipmentOperation) {
        this.equipmentOperations.push(equipmentOperation);
        equipmentOperation.execute();
    }
}