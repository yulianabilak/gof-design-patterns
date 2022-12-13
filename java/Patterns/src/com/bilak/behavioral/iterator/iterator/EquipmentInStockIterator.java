package com.bilak.behavioral.iterator.iterator;

import com.bilak.domain.Equipment;

import java.util.List;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class EquipmentInStockIterator
 * @since 11/8/2022 - 11.04
 **/
public class EquipmentInStockIterator implements EquipmentIterator {
    private final List<Equipment> equipmentList;
    private int position;

    public EquipmentInStockIterator(List<Equipment> equipmentList) {
        this.equipmentList = equipmentList;
    }

    @Override
    public boolean hasNext() {
        while (position < equipmentList.size()) {
            Equipment e = equipmentList.get(position);
            if (e.isInStock()) {
                return true;
            }
            else position++;
        }
        return false;
    }

    @Override
    public Equipment next() {
        Equipment e = equipmentList.get(position);
        position++;
        return e;
    }
}
