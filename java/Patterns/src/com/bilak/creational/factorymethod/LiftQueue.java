package com.bilak.creational.factorymethod;

import com.bilak.creational.factorymethod.subscriptions.StandardSubscription;
import com.bilak.creational.factorymethod.subscriptions.Subscription;
import com.bilak.creational.factorymethod.subscriptions.VipSubscription;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class LiftQueue
 * @since 9/19/2022 - 23.34
 **/
public class LiftQueue {
    private final List<Subscription> queue = new ArrayList<>();
    private int lift;

    public LiftQueue(int lift) {
        this.lift = lift;
    }

    public void add(Subscription sub) {
        if (sub instanceof VipSubscription) {
            for (int i = 0; i < queue.size(); i++) {
                if (queue.get(i) instanceof StandardSubscription) {
                    queue.add(i, sub);
                    return;
                }
            }
        }
        queue.add(sub);
    }

    public void remove() {
        queue.remove(queue.size()-1);
    }

    public int getLift() {
        return lift;
    }

    public void setLift(int lift) {
        this.lift = lift;
    }

    @Override
    public String toString() {
        return "LiftQueue{" +
                "queue=" + queue +
                ", lift=" + lift +
                '}';
    }
}
