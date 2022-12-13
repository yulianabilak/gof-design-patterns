package com.bilak.creational.singleton;

import com.bilak.domain.Equipment;
import com.bilak.domain.EquipmentCategory;
import com.bilak.domain.EquipmentManager;

public class Main {
    public static void main(String[] args) {
        EquipmentManager equipmentManager1 = EquipmentManager.getInstance();
        EquipmentManager equipmentManager2 = EquipmentManager.getInstance();
        System.out.println(equipmentManager1.hashCode());
        System.out.println(equipmentManager2.hashCode());

        Equipment equipment1 = new Equipment("Ski set", EquipmentCategory.A, true, 290, 40, 350, 70);
        Equipment equipment2 = new Equipment("Ski set", EquipmentCategory.B, true, 250, 35, 300, 50);
        Equipment equipment3 = new Equipment("Snowboard set", EquipmentCategory.A, true, 250, 34, 320, 45);

        equipmentManager1.saveEquipment(equipment1, 200);
        equipmentManager1.saveEquipment(equipment2, 100);
        equipmentManager1.saveEquipment(equipment3, 300);
        System.out.println(equipmentManager1.getAllEquipment());
        equipmentManager2.purchaseEquipment(equipment1);
        System.out.println(equipmentManager2.getAllEquipment());
        System.out.println(equipmentManager1.getAllEquipment());

        ThreadDemo T1 = new ThreadDemo("Thread-1");
        T1.start();

        ThreadDemo T2 = new ThreadDemo("Thread-2");
        T2.start();
    }
}