package com.bilak.behavioral.command.command;

import com.bilak.domain.Equipment;
import com.bilak.domain.RentalStation;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class EquipmentSaveOperation
 * @since 11/7/2022 - 13.38
 **/
public class EquipmentSaveOperation extends EquipmentOperation {
    private final Equipment equipment;
    private final Integer quantity;

    public EquipmentSaveOperation(RentalStation rentalStation, Equipment equipment, Integer quantity) {
        super(rentalStation);
        this.equipment = equipment;
        this.quantity = quantity;
    }

    @Override
    public void execute() {
        rentalStation.saveEquipment(equipment, quantity);
    }
}
