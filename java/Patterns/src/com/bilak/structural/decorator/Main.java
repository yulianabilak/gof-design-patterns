package com.bilak.structural.decorator;

import com.bilak.domain.Subscription;
import com.bilak.structural.decorator.components.SkiResortUIService;
import com.bilak.structural.decorator.components.UIService;
import com.bilak.structural.decorator.decorators.DarkThemeUIServiceDecorator;
import com.bilak.structural.decorator.decorators.LightThemeUIServiceDecorator;

import java.time.LocalDateTime;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Main
 * @since 10/10/2022 - 22.10
 **/
public class Main {
    public static void main(String[] args) {
        Subscription subscription = new Subscription(1, "Yuliana Bilak", "timed", 99.9, LocalDateTime.now());

        UIService skiResortUIService = new SkiResortUIService();
        UIService lightThemeUIService = new LightThemeUIServiceDecorator(skiResortUIService);
        UIService darkThemeUIService = new DarkThemeUIServiceDecorator(skiResortUIService);

        System.out.println("Receipt displayed in ordinary theme: ");
        skiResortUIService.displayReceipt(subscription);
        System.out.println("=========================================================================================");

        System.out.println("Receipt displayed in light theme: ");
        lightThemeUIService.displayReceipt(subscription);
        System.out.println("=========================================================================================");

        System.out.println("Receipt displayed in dark theme: ");
        darkThemeUIService.displayReceipt(subscription);
        System.out.println("=========================================================================================");
    }
}
