package com.bilak.behavioral.template;

import com.bilak.domain.EquipmentCategory;
import com.bilak.structural.facade.domain.Equipment;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class EquipmentRental
 * @since 11/25/2022 - 16.34
 **/
public abstract class EquipmentRental {
    private final Scanner scanner = new Scanner(System.in);

    public boolean rent() {
        Client client = collectInfo();
        if (client != null) {
            System.out.println("\nBegin equipment selection process");
            System.out.print("Enter equipment category: ");
            EquipmentCategory category = EquipmentCategory.valueOf(scanner.nextLine());
            System.out.print("Enter height of the client: ");
            double height = scanner.nextDouble();
            Equipment equipmentToRent = findEquipment(height, category);
            if (equipmentToRent != null) {
                pay(equipmentToRent.getBasePrice(), client);
                System.out.println("Payment completed");
                System.out.println(client + " rented " + equipmentToRent + " at " + LocalDateTime.now());
                return true;
            }
        }
        return false;
    }

    public Client collectInfo() {
        System.out.print("Enter name of the client: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone number of the client: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Enter number of identifying document of the client: ");
        String document = scanner.nextLine();
        System.out.print("Enter birthday of the client (yyyy-MM-dd): ");
        LocalDate birthday = LocalDate.parse(scanner.nextLine());

        if (name.replaceAll("\\s", "").equals("") ||
            phoneNumber.replaceAll("\\s", "").equals("") ||
            document.replaceAll("\\s", "").equals("")
        ) {
            return null;
        }
        return new Client(name, phoneNumber, document, birthday);
    }

    public abstract Equipment findEquipment(double height, EquipmentCategory category);

    public void pay(double priceToPay, Client client) {
        if (LocalDate.now().getDayOfWeek().getValue() >= 6) {
            priceToPay *= 1.05;
        }
        System.out.println("Withdrawing " + priceToPay + " UAH from client's " + client.getName() + " bank account...");
    }
}
