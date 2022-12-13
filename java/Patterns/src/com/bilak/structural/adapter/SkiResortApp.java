package com.bilak.structural.adapter;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class SkiResortApp
 * @since 10/2/2022 - 12.49
 **/
public class SkiResortApp implements ISkiResortApp {
    @Override
    public void displayReceipt(XmlData xmlData) {
        System.out.println(xmlData.getData());
    }
}
