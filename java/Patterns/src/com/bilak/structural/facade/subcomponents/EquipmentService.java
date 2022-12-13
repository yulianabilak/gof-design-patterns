package com.bilak.structural.facade.subcomponents;

import com.bilak.domain.EquipmentCategory;
import com.bilak.structural.facade.domain.Equipment;

import java.util.Arrays;
import java.util.List;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class EquipmentService
 * @since 10/14/2022 - 11.26
 **/
public class EquipmentService {
    private static final List<Equipment> availableEquipment = Arrays.asList(
            new Equipment("Ski set", EquipmentCategory.A, 100.0,  175),
            new Equipment("Ski set", EquipmentCategory.A, 100.0,  160),
            new Equipment("Ski set", EquipmentCategory.B,  50.0, 175),
            new Equipment("Ski set", EquipmentCategory.C, 40.0, 160),
            new Equipment("Ski set", EquipmentCategory.D1,  30.0, 110),
            new Equipment("Ski set", EquipmentCategory.D2,  20.0, 110),
            new Equipment("Snowboard set", EquipmentCategory.A, 90.0, 147),
            new Equipment("Snowboard set", EquipmentCategory.C,  80.0, 135),
            new Equipment("Snowboard set", EquipmentCategory.D2,  15.0, 110)
    );

     public static Equipment findEquipment(double height, String type, EquipmentCategory category) {
         if (type.equalsIgnoreCase("ski")) {
             if (height >= 165 && height <= 178) {
                 return availableEquipment.stream()
                         .filter(eq -> eq.getName().equals("Ski set") && eq.getCategory() == category && eq.getLength() == 175)
                         .findFirst()
                         .orElse(null);
             }
             else if (height >= 158 && height < 165) {
                 return availableEquipment.stream()
                         .filter(eq -> eq.getName().equals("Ski set") && eq.getCategory() == category && eq.getLength() == 160)
                         .findFirst()
                         .orElse(null);
             }
             else if (height >= 127 && height <= 135) {
                 return availableEquipment.stream()
                         .filter(eq -> eq.getName().equals("Ski set") && eq.getCategory() == category && eq.getLength() == 110)
                         .findFirst()
                         .orElse(null);
             }
         }
         else if (type.equalsIgnoreCase("snowboard")) {
             if (height >= 163 && height <= 173) {
                 return availableEquipment.stream()
                         .filter(eq -> eq.getName().equals("Snowboard set") && eq.getCategory() == category && eq.getLength() == 147)
                         .findFirst()
                         .orElse(null);
             }
             else if (height >= 152 && height < 163) {
                 return availableEquipment.stream()
                         .filter(eq -> eq.getName().equals("Snowboard set") && eq.getCategory() == category && eq.getLength() == 135)
                         .findFirst()
                         .orElse(null);
             }
             else if (height >= 125 && height <= 135) {
                 return availableEquipment.stream()
                         .filter(eq -> eq.getName().equals("Snowboard set") && eq.getCategory() == category && eq.getLength() == 110)
                         .findFirst()
                         .orElse(null);
             }
         }
        return null;
    }

    public static Equipment findSkis(double height, EquipmentCategory category) {
         Equipment skis = null;
        if (height >= 165 && height <= 178) {
            skis = availableEquipment.stream()
                    .filter(eq -> eq.getName().equals("Ski set") && eq.getCategory() == category && eq.getLength() == 175)
                    .findFirst()
                    .orElse(null);
        }
        else if (height >= 158 && height < 165) {
            skis = availableEquipment.stream()
                    .filter(eq -> eq.getName().equals("Ski set") && eq.getCategory() == category && eq.getLength() == 160)
                    .findFirst()
                    .orElse(null);
        }
        else if (height >= 127 && height <= 135) {
            skis = availableEquipment.stream()
                    .filter(eq -> eq.getName().equals("Ski set") && eq.getCategory() == category && eq.getLength() == 110)
                    .findFirst()
                    .orElse(null);
        }
        return skis;
    }

    public static Equipment findSnowboard(double height, EquipmentCategory category) {
         Equipment snowboard = null;
        if (height >= 163 && height <= 173) {
            snowboard = availableEquipment.stream()
                    .filter(eq -> eq.getName().equals("Snowboard set") && eq.getCategory() == category && eq.getLength() == 147)
                    .findFirst()
                    .orElse(null);
        }
        else if (height >= 152 && height < 163) {
            snowboard = availableEquipment.stream()
                    .filter(eq -> eq.getName().equals("Snowboard set") && eq.getCategory() == category && eq.getLength() == 135)
                    .findFirst()
                    .orElse(null);
        }
        else if (height >= 125 && height <= 135) {
            snowboard = availableEquipment.stream()
                    .filter(eq -> eq.getName().equals("Snowboard set") && eq.getCategory() == category && eq.getLength() == 110)
                    .findFirst()
                    .orElse(null);
        }
        return snowboard;
    }
}
