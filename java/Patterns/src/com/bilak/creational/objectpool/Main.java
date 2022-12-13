package com.bilak.creational.objectpool;

import com.bilak.domain.EquipmentCategory;
import com.bilak.domain.RentalStation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Main
 * @since 9/25/2022 - 00.36
 **/
public class Main {
    public static void main(String[] args) {
        RentalStationPool pool = new RentalStationPool();
        List<RentalStation> stations = new ArrayList<>(Arrays.asList(
                pool.getStation(),
                pool.getStation(),
                pool.getStation(),
                pool.getStation(),
                pool.getStation()
        ));
        RentalStation station = stations.get(0);
        station.purchaseEquipment("Ski set", EquipmentCategory.B);
        System.out.println(station);
        station = stations.get(1);
        station.purchaseEquipment("Ski set", EquipmentCategory.B);
        System.out.println(station + "\n");
        for (RentalStation st : stations) {
            System.out.println(st);
        }
        pool.releaseStation(station);
        stations.remove(station);
        stations.set(3, pool.getStation());
        System.out.println("\n" + stations.get(3));
    }
}
