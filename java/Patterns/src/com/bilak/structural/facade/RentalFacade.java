package com.bilak.structural.facade;

import com.bilak.domain.EquipmentCategory;
import com.bilak.structural.facade.domain.Client;
import com.bilak.structural.facade.domain.Equipment;
import com.bilak.structural.facade.subcomponents.EquipmentService;
import com.bilak.structural.facade.subcomponents.PaymentService;
import com.bilak.structural.facade.subcomponents.RentalService;

import java.time.LocalDateTime;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class RentalFacade
 * @since 10/14/2022 - 11.21
 **/
public class RentalFacade {
    public boolean makeRental(Client client, String equipmentType, EquipmentCategory category) {
        boolean rentalFulfilled = false;
        Equipment eqForRent = EquipmentService.findEquipment(client.getHeight(), equipmentType, category);
        if (eqForRent != null) {
            System.out.println("Equipment " + eqForRent.getName() + " " + eqForRent.getCategory() + " is available.");
            if (PaymentService.makePayment(eqForRent.getBasePrice(), client)) {
                System.out.println("Payment confirmed.");
                RentalService.add("Rental at " + LocalDateTime.now() + " for client " + client + " with equipment " + eqForRent);
                rentalFulfilled = true;
            }
        }
        return rentalFulfilled;
    }
}
