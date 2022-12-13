package com.bilak.behavioral.command.invoker;

import com.bilak.behavioral.command.command.EquipmentOperation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class EquipmentOperationExecutor
 * @since 11/7/2022 - 13.54
 **/
public class EquipmentOperationExecutor {
    private final List<EquipmentOperation> equipmentOperations = new ArrayList<>();

    public void executeOperation(EquipmentOperation equipmentOperation) {
        equipmentOperations.add(equipmentOperation);
        equipmentOperation.execute();
    }

    public List<EquipmentOperation> getEquipmentOperations() {
        return equipmentOperations;
    }
}
