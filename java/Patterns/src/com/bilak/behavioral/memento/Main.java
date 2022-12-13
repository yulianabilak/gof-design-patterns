package com.bilak.behavioral.memento;

import com.bilak.domain.Equipment;
import com.bilak.domain.EquipmentCategory;
import com.bilak.domain.EquipmentManager;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Main
 * @since 11/13/2022 - 14.00
 **/
public class Main {
    public static void main(String[] args) {
        EquipmentManager originator = EquipmentManager.getInstance();
        History operationHistory = new History();

        Equipment equipment1 = new Equipment("Ski set", EquipmentCategory.A, true, 100, 100, 100, 100);
        Equipment equipment2 = new Equipment("Ski set", EquipmentCategory.B, true, 100, 100, 100, 100);
        Equipment equipment3 = new Equipment("Ski set", EquipmentCategory.C, true, 100, 100, 100, 100);
        originator.saveEquipment(equipment1, 5);
        operationHistory.add(originator.saveState());
        originator.saveEquipment(equipment2, 10);
        operationHistory.add(originator.saveState());

        originator.saveEquipment(equipment3, 11);
        System.out.println(originator.getAllEquipment());
        originator.restore(operationHistory.get());
        System.out.println(originator.getAllEquipment());
    }
}
