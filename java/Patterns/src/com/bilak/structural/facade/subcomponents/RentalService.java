package com.bilak.structural.facade.subcomponents;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class RentalService
 * @since 10/14/2022 - 16.54
 **/
public class RentalService {
    private static List<String> rentals = new ArrayList<>();

    public static void add(String record) {
        rentals.add(record);
    }

    public static List<String> getRentals() {
        return rentals;
    }
}
