package com.bilak.structural.decorator.decorators;

import com.bilak.domain.Subscription;
import com.bilak.structural.decorator.components.UIService;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class LightThemeUIServiceDecorator
 * @since 10/10/2022 - 22.33
 **/
public class LightThemeUIServiceDecorator extends UIServiceDecorator {
    public LightThemeUIServiceDecorator(UIService decoratedService) {
        super(decoratedService);
    }

    @Override
    public void displayReceipt(Subscription subscription) {
        super.displayReceipt(subscription);
        System.out.println("Style{fontSize: 16px; color: black; background: white; fontWeight: bold}");
    }
}
