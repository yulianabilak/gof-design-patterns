package com.bilak.structural.facade;

import com.bilak.domain.EquipmentCategory;
import com.bilak.structural.facade.domain.Client;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Main
 * @since 10/14/2022 - 11.04
 **/
public class Main {
    public static void main(String[] args) {
        Client client = new Client("Yuliana Bilak", "00000000", 172);
        RentalFacade facade = new RentalFacade();
        boolean rentalFulfilled = facade.makeRental(client, "ski", EquipmentCategory.A);
        if (rentalFulfilled) {
            System.out.println("Rental successfully fulfilled.");
        }
        else System.out.println("Couldn't make rental. Maybe your equipment wasn't available or there was an error.");
    }
}
