package com.bilak.domain;

import com.bilak.behavioral.observer.NotificationChannel;
import com.bilak.creational.objectpool.StationStatus;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class RentalStation
 * @since 9/24/2022 - 23.48
 **/
public class RentalStation {
    private String name;
    private String address;
    private StationStatus status;
    private Map<Equipment, Integer> equipment;
    private NotificationChannel publisher;

    public RentalStation() {
    }

    public RentalStation(String name, String address, StationStatus status, Map<Equipment, Integer> equipment) {
        this.name = name;
        this.address = address;
        this.status = status;
        this.equipment = equipment;
    }

    public RentalStation(NotificationChannel publisher) {
        this.equipment = new HashMap<>();
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public StationStatus getStatus() {
        return status;
    }

    public void setStatus(StationStatus status) {
        this.status = status;
    }

    public Map<Equipment, Integer> getEquipment() {
        return equipment;
    }

    public void setEquipment(Map<Equipment, Integer> equipment) {
        this.equipment = equipment;
    }

    public NotificationChannel getPublisher() {
        return publisher;
    }

    public void setPublisher(NotificationChannel publisher) {
        this.publisher = publisher;
    }

    public void saveEquipment(Equipment eq, Integer quantity) {
        System.out.println("Saving equipment...\n");
        if (equipment.get(eq) == null) {
            publisher.addEquipmentType(eq.getName() + " " + eq.getCategory());
        }
        if (equipment.get(eq) != null && equipment.get(eq) == 0) {
            eq.setInStock(true);
            publisher.notifyAll(eq.getName() + " " + eq.getCategory(), eq.getName(), eq.getCategory().name());
        }
        //if (eq.isInStock()) {
            equipment.put(eq, quantity);
        //}
        //else {
        //    System.out.println("Your equipment is not in stock.\n");
        //}
        //System.out.println(equipment);
    }

    public void removeEquipment(Equipment eq) {
        System.out.println("\nRemoving equipment...\n");
        equipment.remove(eq);
        System.out.println(equipment);
    }

    public void purchaseEquipment(String name, EquipmentCategory category) {
        System.out.println("\nMaking a purchase...\n");
        Equipment eqToPurchase = equipment.keySet().stream().filter(eq -> Objects.equals(eq.getName(), name) && eq.getCategory() == category).findFirst().orElse(null);
        if (eqToPurchase == null) {
            System.out.println("This type of equipment doesn't exist in this rental station.");
            return;
        }
        if (equipment.get(eqToPurchase) - 1 == 0) {
            eqToPurchase.setInStock(false);
        }
        equipment.put(eqToPurchase, equipment.get(eqToPurchase) - 1);
        System.out.println(equipment);
    }

    @Override
    public String toString() {
        return "RentalStation{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", status=" + status +
                ", equipment=" + equipment +
                '}';
    }
}
