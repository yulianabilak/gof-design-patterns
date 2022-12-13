package com.bilak.behavioral.iterator.collection;

import com.bilak.behavioral.iterator.iterator.EquipmentIterator;
import com.bilak.domain.Equipment;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class EquipmentCollection
 * @since 11/8/2022 - 10.54
 **/
public interface EquipmentCollection {
    void addEquipment(Equipment e);
    void removeEquipment(Equipment e);
    EquipmentIterator inStockIterator();
    EquipmentIterator notInStockIterator();
}
