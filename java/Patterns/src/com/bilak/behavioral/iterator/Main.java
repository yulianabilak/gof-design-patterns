package com.bilak.behavioral.iterator;

import com.bilak.behavioral.iterator.collection.EquipmentCollection;
import com.bilak.behavioral.iterator.collection.EquipmentCollectionImpl;
import com.bilak.behavioral.iterator.iterator.EquipmentIterator;
import com.bilak.domain.Equipment;
import com.bilak.domain.EquipmentCategory;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Main
 * @since 11/8/2022 - 10.52
 **/
public class Main {
    public static void main(String[] args) {
        EquipmentCollection equipment = new EquipmentCollectionImpl();
        equipment.addEquipment(new Equipment("Ski set", EquipmentCategory.A, true, 100, 100, 100, 100));
        equipment.addEquipment(new Equipment("Ski set", EquipmentCategory.B, false, 50, 50, 50, 50));
        equipment.addEquipment(new Equipment("Snowboard set", EquipmentCategory.A, true, 90, 90, 90, 90));
        equipment.addEquipment(new Equipment("Snowboard set", EquipmentCategory.B, true, 80, 80, 80, 80));
        equipment.addEquipment(new Equipment("Snowboard set", EquipmentCategory.C, false, 80, 80, 80, 80));

        EquipmentIterator inStockIterator = equipment.inStockIterator();
        while (inStockIterator.hasNext()) {
            System.out.println(inStockIterator.next());
        }
        System.out.println("==============================================");
        EquipmentIterator notInStockIterator = equipment.notInStockIterator();
        while (notInStockIterator.hasNext()) {
            System.out.println(notInStockIterator.next());
        }
    }
}
