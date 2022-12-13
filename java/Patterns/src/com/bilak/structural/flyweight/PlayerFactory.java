package com.bilak.structural.flyweight;

import com.bilak.domain.EquipmentCategory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class PlayerFactory
 * @since 10/15/2022 - 20.05
 **/
public class PlayerFactory {
    private static final Map<String, PlayerType> playerTypes = new HashMap<>();

    public static PlayerType getPlayerType(String equipmentName, EquipmentCategory category, String color) {
        PlayerType playerType = playerTypes.get(equipmentName);
        if (playerType == null) {
            playerType = new PlayerType(equipmentName, category, color);
            playerTypes.put(equipmentName, playerType);
        }
        return playerType;
    }
}
