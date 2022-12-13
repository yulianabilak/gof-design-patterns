package com.bilak.structural.decorator.components;

import com.bilak.domain.Subscription;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class SkiResortUIService
 * @since 10/10/2022 - 22.20
 **/
public class SkiResortUIService implements UIService {
    @Override
    public void displayReceipt(Subscription subscription) {
        System.out.println(subscription);
    }
}
