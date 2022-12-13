package com.bilak.creational.prototype;

import com.bilak.domain.Equipment;
import com.bilak.domain.EquipmentCategory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class EquipmentCache
 * @since 9/13/2022 - 15.52
 **/
public class EquipmentCache {
    private final Map<String, Equipment> cache = new HashMap<>();

    public EquipmentCache() {
        Equipment equipment1 = new Equipment("Ski set", EquipmentCategory.A, true, 290, 40, 350, 70);
        Equipment equipment2 = new Equipment("Snowboard set", EquipmentCategory.A, true, 250, 34, 320, 45);

        cache.put("Ski set", equipment1);
        cache.put("Snowboard set", equipment2);
    }

    public Equipment get(String key) {
        return cache.get(key).clone();
    }
}
