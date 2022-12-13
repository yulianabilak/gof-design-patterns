package com.bilak.behavioral.memento;

import com.bilak.domain.Equipment;

import java.util.Map;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class EquipmentManagerState
 * @since 11/13/2022 - 14.01
 **/
//MEMENTO
public class EquipmentManagerState {
    private final Map<Equipment, Integer> equipment;

    public EquipmentManagerState(Map<Equipment, Integer> equipment) {
        this.equipment = equipment;
    }

    public Map<Equipment, Integer> getEquipment() {
        return equipment;
    }
}
