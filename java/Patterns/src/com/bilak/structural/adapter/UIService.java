package com.bilak.structural.adapter;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class UIService
 * @since 10/1/2022 - 17.48
 **/
public class UIService {
    public void displayReceipt(JsonData data) {
        System.out.println("\033[1;34m" + data.getData() + "\033[0m");
    }
}
