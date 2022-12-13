package com.bilak.structural.decorator.decorators;

import com.bilak.domain.Subscription;
import com.bilak.structural.decorator.components.UIService;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class DarkThemeUIServiceDecorator
 * @since 10/10/2022 - 22.38
 **/
public class DarkThemeUIServiceDecorator extends UIServiceDecorator {
    public DarkThemeUIServiceDecorator(UIService decoratedService) {
        super(decoratedService);
    }

    @Override
    public void displayReceipt(Subscription subscription) {
        super.displayReceipt(subscription);
        System.out.println("Style{fontSize: 16px; color: white; background: black; fontWeight: bold}");
    }
}
