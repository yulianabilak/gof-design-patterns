package com.bilak.behavioral.iterator.iterator;

import com.bilak.domain.Equipment;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class EquipmentIterator
 * @since 11/8/2022 - 10.58
 **/
public interface EquipmentIterator {
    boolean hasNext();
    Equipment next();
}
