package com.bilak.structural.adapter;

import com.bilak.domain.Subscription;

import java.time.LocalDateTime;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Main
 * @since 10/1/2022 - 17.54
 **/
public class Main {
    public static void main(String[] args) {
        SkiResortApp app = new SkiResortApp();

        Subscription subscription = new Subscription(1, "Yuliana Bilak", "timed", 500.5, LocalDateTime.now());
        String result = "<Receipt>\n\t<id>" + subscription.getId() + "</id>" +
                "\n\t<client>" + subscription.getClient() + "</client>" +
                "\n\t<type>" + subscription.getType() + "</type>" +
                "\n\t<price>" + subscription.getPrice() + "</price>" +
                "\n\t<sellDate>" + subscription.getSellDate() + "</sellDate>" +
                "\n</Receipt>";
        XmlData xmlData = new XmlData(result);

        app.displayReceipt(xmlData);

        UIService uiService = new UIService();
        //uiService.displayReceipt(xmlData);

        UIServiceAdapter adapter = new UIServiceAdapter(uiService);
        adapter.displayReceipt(xmlData);
    }
}
