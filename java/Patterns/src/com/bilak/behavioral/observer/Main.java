package com.bilak.behavioral.observer;

import com.bilak.domain.Equipment;
import com.bilak.domain.EquipmentCategory;
import com.bilak.domain.RentalStation;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Main
 * @since 11/13/2022 - 16.49
 **/
public class Main {
    public static void main(String[] args) {
        RentalStation rentalStation = new RentalStation(new NotificationChannel());
        Equipment equipment1 = new Equipment("Ski set", EquipmentCategory.A, false, 100, 100, 100, 100);
        Equipment equipment2 = new Equipment("Ski set", EquipmentCategory.B, false, 100, 100, 100, 100);
        rentalStation.saveEquipment(equipment1, 0);
        rentalStation.saveEquipment(equipment2, 0);

        Subscriber client1 = new Client("April", "fjhjd@gmail.com");
        Subscriber client2 = new Client("Mary", "fjjkhjd@gmail.com");
        rentalStation.getPublisher().subscribe("Ski set A", client1);
        rentalStation.getPublisher().subscribe("Ski set B", client2);

        rentalStation.saveEquipment(equipment1, 2);
        rentalStation.saveEquipment(equipment2, 55);
    }
}
