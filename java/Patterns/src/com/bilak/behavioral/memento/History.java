package com.bilak.behavioral.memento;

import java.util.Stack;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class History
 * @since 11/13/2022 - 14.12
 **/
public class History {
    private Stack<EquipmentManagerState> mementoList = new Stack<>();

    public void add(EquipmentManagerState state) {
        mementoList.push(state);
    }

    public EquipmentManagerState get() {
        return mementoList.peek();
    }
}
