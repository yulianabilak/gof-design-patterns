package com.bilak.behavioral.command;

import com.bilak.behavioral.command.command.EquipmentPurchaseOperation;
import com.bilak.behavioral.command.command.EquipmentRemoveOperation;
import com.bilak.behavioral.command.command.EquipmentSaveOperation;
import com.bilak.behavioral.command.invoker.EquipmentOperationExecutor;
import com.bilak.domain.Equipment;
import com.bilak.domain.EquipmentCategory;
import com.bilak.domain.RentalStation;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Main
 * @since 11/7/2022 - 13.22
 **/
public class Main {
    public static void main(String[] args) {
        RentalStation rentalStation = new RentalStation();
        Map<Equipment, Integer> equipmentSet = new HashMap<>();
        equipmentSet.put(new Equipment("Ski set", EquipmentCategory.A, true, 100, 100, 100, 100), 200);
        equipmentSet.put(new Equipment("Ski set", EquipmentCategory.B, true, 50, 50, 50, 50), 100);
        rentalStation.setEquipment(equipmentSet);

        Equipment equipment = new Equipment("Snowboard set", EquipmentCategory.C, true, 80, 80, 80, 80);
        EquipmentOperationExecutor equipmentOperationExecutor = new EquipmentOperationExecutor();
        equipmentOperationExecutor.executeOperation(new EquipmentSaveOperation(rentalStation, equipment, 80));
        equipmentOperationExecutor.executeOperation(new EquipmentRemoveOperation(rentalStation, equipment));
        equipmentOperationExecutor.executeOperation(new EquipmentPurchaseOperation(rentalStation, "Ski set", EquipmentCategory.A));

        System.out.println("=========================================================================================");
        System.out.println("Command history: " + equipmentOperationExecutor.getEquipmentOperations());
    }
}
