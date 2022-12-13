package com.bilak.behavioral.observer;

import java.util.*;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class NotificationChannel
 * @since 11/13/2022 - 17.04
 **/
public class NotificationChannel {
    private final Map<String, List<Subscriber>> subscribers = new HashMap<>();

    public void subscribe(String equipmentType, Subscriber subscriber) {
        List<Subscriber> subs = subscribers.get(equipmentType);
        subs.add(subscriber);
    }

    public void unsubscribe(String equipmentType, Subscriber subscriber) {
        List<Subscriber> subs = subscribers.get(equipmentType);
        subs.remove(subscriber);
    }

    public void notifyAll(String equipmentType, String eqName, String eqCategory) {
        List<Subscriber> subs = subscribers.get(equipmentType);
        subs.forEach(sub -> sub.update(eqName, eqCategory));
    }

    public void addEquipmentType(String equipmentType) {
        subscribers.put(equipmentType, new ArrayList<>());
    }
}
