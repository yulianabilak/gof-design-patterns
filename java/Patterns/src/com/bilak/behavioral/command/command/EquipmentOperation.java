package com.bilak.behavioral.command.command;

import com.bilak.domain.RentalStation;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class EquipmentOperation
 * @since 11/7/2022 - 13.40
 **/
public abstract class EquipmentOperation {
    protected RentalStation rentalStation;

    public EquipmentOperation(RentalStation rentalStation) {
        this.rentalStation = rentalStation;
    }

    public RentalStation getRentalStation() {
        return rentalStation;
    }

    public void setRentalStation(RentalStation rentalStation) {
        this.rentalStation = rentalStation;
    }

    public abstract void execute();
}
