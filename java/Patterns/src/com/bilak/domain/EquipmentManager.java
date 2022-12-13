package com.bilak.domain;

import com.bilak.behavioral.memento.EquipmentManagerState;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project Singleton
 * @class EquipmentManager
 * @since 9/13/2022 - 12.10
 **/
public class EquipmentManager {
    private Map<Equipment, Integer> equipment;

    private EquipmentManager() {
        equipment = new HashMap<>();
    }

    private static class EquipmentManagerHelper {
        private static final EquipmentManager INSTANCE = new EquipmentManager();
    }

    public static EquipmentManager getInstance() {
        return EquipmentManagerHelper.INSTANCE;
    }

    public Map<Equipment, Integer> getAllEquipment() {
        System.out.println("Getting all available equipment...\n");
        return equipment;
    }

    public void saveEquipment(Equipment eq, Integer quantity) {
        System.out.println("Saving equipment...\n");
        if (equipment.get(eq) != null && equipment.get(eq) == 0) {
            eq.setInStock(true);
        }
        if (eq.isInStock()) {
            equipment.put(eq, quantity);
        }
        else {
            System.out.println("Your equipment is not in stock.\n");
        }
    }

    public void removeEquipment(Equipment eq) {
        System.out.println("Removing equipment...\n");
        equipment.remove(eq);
    }

    public void clear() {
        System.out.println("Deleting all equipment...\n");
        equipment.clear();
    }

    public int count() {
        System.out.println("Counting all equipment...\n");
        return equipment.size();
    }

    public void purchaseEquipment(Equipment eq) {
        System.out.println("Making a purchase...\n");
        if (equipment.get(eq) - 1 == 0) {
            eq.setInStock(false);
        }
        equipment.put(eq, equipment.get(eq) - 1);
    }

    public EquipmentManagerState saveState() {
        return new EquipmentManagerState(new HashMap<>(equipment));
    }

    public void restore(EquipmentManagerState state) {
        equipment = state.getEquipment();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EquipmentManager that = (EquipmentManager) o;
        return Objects.equals(equipment, that.equipment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(equipment);
    }
}
