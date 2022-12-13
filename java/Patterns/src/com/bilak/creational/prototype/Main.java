package com.bilak.creational.prototype;

import com.bilak.domain.Equipment;
import com.bilak.domain.EquipmentCategory;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Main
 * @since 9/13/2022 - 15.10
 **/
public class Main {
    public static void main(String[] args) {
        EquipmentCache equipmentCache = new EquipmentCache();
        Equipment equipment1 = equipmentCache.get("Ski set");
        Equipment equipment2 = equipmentCache.get("Ski set");

        System.out.println(equipment1.equals(equipment2));

        Equipment equipment3 = equipmentCache.get("Ski set");
        System.out.println(equipment3);
        System.out.println(equipment1);

        equipment3.setCategory(EquipmentCategory.B);
        equipment3.setPricePerDayRegular(250);
        equipment3.setPricePerHourRegular(35);
        equipment3.setPricePerDayWknds(300);
        equipment3.setPricePerHourWknds(50);

        System.out.println(equipment3);
        System.out.println(equipment1);
    }
}
