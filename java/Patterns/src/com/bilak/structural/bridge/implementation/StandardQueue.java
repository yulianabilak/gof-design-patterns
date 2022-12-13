package com.bilak.structural.bridge.implementation;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class StandardQueue
 * @since 10/2/2022 - 18.57
 **/
public class StandardQueue implements Queue {
    private final List<String> standardPasses = new ArrayList<>();
    private int lift;

    public StandardQueue(int lift) {
        this.lift = lift;
    }

    @Override
    public void pass(String client) {
        standardPasses.add("Client: " + client + " passed from standard queue at " + LocalDateTime.now());
    }


    public List<String> getStandardPasses() {
        return standardPasses;
    }

    public int getLift() {
        return lift;
    }

    public void setLift(int lift) {
        this.lift = lift;
    }

    @Override
    public String toString() {
        return "StandardQueue{" +
                "standardPasses=" + standardPasses +
                ", lift=" + lift +
                '}';
    }
}
