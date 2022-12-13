package com.bilak.behavioral.command.command;

import com.bilak.domain.EquipmentCategory;
import com.bilak.domain.RentalStation;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class EquipmentPurchaseOperation
 * @since 11/7/2022 - 13.50
 **/
public class EquipmentPurchaseOperation extends EquipmentOperation {
    private final String name;
    private final EquipmentCategory category;

    public EquipmentPurchaseOperation(RentalStation rentalStation, String name, EquipmentCategory category) {
        super(rentalStation);
        this.name = name;
        this.category = category;
    }

    @Override
    public void execute() {
        rentalStation.purchaseEquipment(name, category);
    }
}
