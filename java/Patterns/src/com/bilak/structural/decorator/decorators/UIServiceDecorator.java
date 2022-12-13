package com.bilak.structural.decorator.decorators;

import com.bilak.domain.Subscription;
import com.bilak.structural.decorator.components.UIService;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class UIServiceDecorator
 * @since 10/10/2022 - 22.29
 **/
public abstract class UIServiceDecorator implements UIService {
    protected UIService decoratedService;

    public UIServiceDecorator(UIService decoratedService) {
        this.decoratedService = decoratedService;
    }

    @Override
    public void displayReceipt(Subscription subscription) {
        decoratedService.displayReceipt(subscription);
    }
}
