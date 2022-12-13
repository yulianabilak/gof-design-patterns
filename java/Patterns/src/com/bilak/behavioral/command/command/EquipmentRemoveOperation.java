package com.bilak.behavioral.command.command;

import com.bilak.domain.Equipment;
import com.bilak.domain.RentalStation;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class EquipmentRemoveOperation
 * @since 11/7/2022 - 13.48
 **/
public class EquipmentRemoveOperation extends EquipmentOperation {
    private final Equipment equipment;

    public EquipmentRemoveOperation(RentalStation rentalStation, Equipment equipment) {
        super(rentalStation);
        this.equipment = equipment;
    }

    @Override
    public void execute() {
        rentalStation.removeEquipment(equipment);
    }
}
