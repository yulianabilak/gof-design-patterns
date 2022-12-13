package com.bilak.behavioral.iterator.collection;

import com.bilak.behavioral.iterator.iterator.EquipmentInStockIterator;
import com.bilak.behavioral.iterator.iterator.EquipmentIterator;
import com.bilak.behavioral.iterator.iterator.EquipmentNotInStockIterator;
import com.bilak.domain.Equipment;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class EquipmentCollectionImpl
 * @since 11/8/2022 - 11.02
 **/
public class EquipmentCollectionImpl implements EquipmentCollection {
    private final List<Equipment> equipmentList;

    public EquipmentCollectionImpl() {
        equipmentList = new ArrayList<>();
    }

    @Override
    public void addEquipment(Equipment e) {
        equipmentList.add(e);
    }

    @Override
    public void removeEquipment(Equipment e) {
        equipmentList.remove(e);
    }

    @Override
    public EquipmentIterator inStockIterator() {
        return new EquipmentInStockIterator(equipmentList);
    }

    @Override
    public EquipmentIterator notInStockIterator() {
        return new EquipmentNotInStockIterator(equipmentList);
    }
}
