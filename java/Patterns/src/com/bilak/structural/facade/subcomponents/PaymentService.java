package com.bilak.structural.facade.subcomponents;

import com.bilak.structural.facade.domain.Client;

import java.time.LocalDate;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class PaymentService
 * @since 10/14/2022 - 16.40
 **/
public class PaymentService {
    public static boolean makePayment(double priceToPay, Client client) {
        if (LocalDate.now().getDayOfWeek().getValue() >= 6) {
            priceToPay *= 1.05;
        }
        System.out.println("Withdrawing " + priceToPay + " UAH from client's " + client.getName() + " bank account...");
        return true;
    }
}
