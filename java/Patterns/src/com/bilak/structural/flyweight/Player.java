package com.bilak.structural.flyweight;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Player
 * @since 10/15/2022 - 14.08
 **/
public class Player {
    private int x;
    private int y;
    private PlayerType playerType;

    public Player(int x, int y, PlayerType playerType) {
        this.x = x;
        this.y = y;
        this.playerType = playerType;
    }

    public void display() {
        playerType.display(x, y);
    }

    public void move(int newX, int newY) {
        x = newX;
        y = newY;
        display();
    }
}
