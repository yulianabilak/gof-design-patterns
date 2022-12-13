package com.bilak.creational.singleton;

import com.bilak.domain.EquipmentManager;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project Singleton
 * @class ThreadDemo
 * @since 9/13/2022 - 13.03
 **/
public class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;

    public ThreadDemo(String name) {
        this.threadName = name;
        System.out.println("Creating " + threadName + "\n");
    }

    public void run() {
        System.out.println("Running " + threadName + "\n");
        EquipmentManager equipmentManager = EquipmentManager.getInstance();

        System.out.println(equipmentManager.getAllEquipment());
        System.out.println("Hash code: " + equipmentManager.hashCode() + "\n");

        System.out.println("Types of equipment available: " + equipmentManager.count());

        System.out.println("Thread " + threadName + " exiting\n");
    }

    public void start() {
        System.out.println("Starting " + threadName + "\n");
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
