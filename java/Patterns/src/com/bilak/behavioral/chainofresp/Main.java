package com.bilak.behavioral.chainofresp;

import com.bilak.behavioral.chainofresp.handlers.AgeDiscountHandler;
import com.bilak.behavioral.chainofresp.handlers.BenefitDiscountHandler;
import com.bilak.behavioral.chainofresp.handlers.DateDiscountHandler;
import com.bilak.behavioral.chainofresp.handlers.DiscountHandler;
import com.bilak.behavioral.chainofresp.request.Client;
import com.bilak.behavioral.chainofresp.request.SubscriptionPurchaseRequest;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Main
 * @since 11/5/2022 - 13.59
 **/
public class Main {
    public static void main(String[] args) {
        Client client = new Client("Blanche Fallowes", LocalDate.of(2013, 1, 2));
        SubscriptionPurchaseRequest request = new SubscriptionPurchaseRequest(client, "timed", LocalDateTime.of(2022,  3, 24, 8, 44), 500);

        DiscountHandler ageDiscountHandler = new AgeDiscountHandler();
        DiscountHandler dateDiscountHandler = new DateDiscountHandler();
        DiscountHandler benefitDiscountHandler = new BenefitDiscountHandler();
        ageDiscountHandler.setNextHandler(dateDiscountHandler).setNextHandler(benefitDiscountHandler);

        System.out.println("Chain: Age -> Date -> Benefit\n");
        double discount = ageDiscountHandler.getDiscount(request);
        System.out.println("Discount: " + discount);

        System.out.println("\nChain: Date -> Benefit\n");
        discount = dateDiscountHandler.getDiscount(request);
        System.out.println("Discount: " + discount);
    }
}
