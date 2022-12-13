package com.bilak.structural.flyweight;

import com.bilak.domain.EquipmentCategory;

import static java.lang.Math.random;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Main
 * @since 10/15/2022 - 14.07
 **/
public class Main {
    public static void main(String[] args) {
        int playersToDisplay = 20;
        int playerTypes = 2;

        for (int i = 0; i < playersToDisplay / 2; i++) {
            PlayerType playerType1 = PlayerFactory.getPlayerType("ski", EquipmentCategory.B, "blue");
            Player player1 = new Player((int) (random() * 101), (int) (random() * 101), playerType1);
            player1.display();

            PlayerType playerType2 = PlayerFactory.getPlayerType("snowboard", EquipmentCategory.A, "black");
            Player player2 = new Player((int) (random() * 101), (int) (random() * 101), playerType2);
            player2.display();
        }

        System.out.println("====================================================================================");
        System.out.println("Memory usage: ");
        System.out.println("Player's size (8 bytes) * " + playersToDisplay + " + ");
        System.out.println("Player type's size (~25 bytes) * " + playerTypes);
        System.out.println("====================================================================================");
        System.out.println("Total: " + (playersToDisplay * 8 + playerTypes * 25) + " bytes");
        System.out.println("Instead of: " + (playersToDisplay * 32) + " bytes");
    }
}
