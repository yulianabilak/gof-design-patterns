package com.bilak.behavioral.template;

import com.bilak.domain.EquipmentCategory;
import com.bilak.structural.facade.domain.Equipment;
import com.bilak.structural.facade.subcomponents.EquipmentService;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class SkiRental
 * @since 11/26/2022 - 17.14
 **/
public class SkiRental extends EquipmentRental {
    @Override
    public Equipment findEquipment(double height, EquipmentCategory category) {
        return EquipmentService.findSkis(height, category);
    }
}
