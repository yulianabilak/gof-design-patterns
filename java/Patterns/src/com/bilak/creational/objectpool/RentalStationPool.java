package com.bilak.creational.objectpool;

import com.bilak.domain.Equipment;
import com.bilak.domain.EquipmentCategory;
import com.bilak.domain.RentalStation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class RentalStationPool
 * @since 9/25/2022 - 00.12
 **/
public class RentalStationPool {
    private final List<RentalStation> pool;

    public RentalStationPool() {
        Map<Equipment, Integer> equipmentSet1 = new HashMap<>();
        equipmentSet1.put(new Equipment("Ski set", EquipmentCategory.A, true, 100, 100, 100, 100), 200);
        equipmentSet1.put(new Equipment("Ski set", EquipmentCategory.B, true, 50, 50, 50, 50), 100);
        equipmentSet1.put(new Equipment("Snowboard set", EquipmentCategory.A, true, 90, 90, 90, 90), 200);
        equipmentSet1.put(new Equipment("Snowboard set", EquipmentCategory.B, true, 80, 80, 80, 80), 100);
        Map<Equipment, Integer> equipmentSet2 = new HashMap<>();
        equipmentSet2.put(new Equipment("Ski set", EquipmentCategory.A, true, 100, 100, 100, 100), 50);
        equipmentSet2.put(new Equipment("Snowboard set", EquipmentCategory.A, true, 90, 90, 90, 90), 300);
        pool = Arrays.asList(
                new RentalStation("Station #1", "Polyanytsya, Ivano-Frankivsk Oblast, 78593", StationStatus.FREE, equipmentSet1),
                new RentalStation("Station #2", "Polyanytsya, Ivano-Frankivsk Oblast, 26754", StationStatus.FREE, equipmentSet2),
                new RentalStation("Station #3", "Polyanytsya, Ivano-Frankivsk Oblast, 94981", StationStatus.FREE, equipmentSet2),
                new RentalStation("Station #4", "Polyanytsya, Ivano-Frankivsk Oblast, 39782", StationStatus.FREE, equipmentSet1)
        );
    }

    public RentalStation getStation() {
        RentalStation station = pool.stream().filter(st -> st.getStatus() == StationStatus.FREE).findFirst().orElse(null);
        if (station == null) {
            System.out.println("No free rental stations right now.");
            return null;
        }
        station.setStatus(StationStatus.BUSY);
        return station;
    }

    public void releaseStation(RentalStation station) {
        station.setStatus(StationStatus.FREE);
    }
}
