package com.bilak.behavioral.observer;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Subscriber
 * @since 11/13/2022 - 16.55
 **/
public interface Subscriber {
    void update(String eqName, String eqCategory);
}
