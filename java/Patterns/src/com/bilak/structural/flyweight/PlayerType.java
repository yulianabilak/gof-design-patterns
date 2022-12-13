package com.bilak.structural.flyweight;

import com.bilak.domain.EquipmentCategory;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class PlayerType
 * @since 10/15/2022 - 14.11
 **/
//FLYWEIGHT
public class PlayerType {
    private final String equipmentName;
    private final EquipmentCategory equipmentCategory;
    private final String equipmentColor;

    public PlayerType(String equipmentName, EquipmentCategory equipmentCategory, String equipmentColor) {
        this.equipmentName = equipmentName;
        this.equipmentCategory = equipmentCategory;
        this.equipmentColor = equipmentColor;
    }

    public void display(int x, int y) {
        System.out.println("New player with " + equipmentColor + " equipment " + equipmentName + " of category " + equipmentCategory +
                " displayed: x=" + x + ", y=" + y);
    }
}
