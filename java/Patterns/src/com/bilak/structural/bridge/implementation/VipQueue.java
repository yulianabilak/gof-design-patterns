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
 * @class VipQueue
 * @since 10/2/2022 - 18.56
 **/
public class VipQueue implements Queue {
    private final List<String> vipPasses = new ArrayList<>();
    private int lift;

    public VipQueue(int lift) {
        this.lift = lift;
    }

    @Override
    public void pass(String client) {
        vipPasses.add("Client: " + client + " passed from vip queue at " + LocalDateTime.now());
    }

    public List<String> getVipPasses() {
        return vipPasses;
    }

    public int getLift() {
        return lift;
    }

    public void setLift(int lift) {
        this.lift = lift;
    }

    @Override
    public String toString() {
        return "VipQueue{" +
                "vipPasses=" + vipPasses +
                ", lift=" + lift +
                '}';
    }
}
