package com.bilak.behavioral.strategy.strategies;

import com.bilak.behavioral.strategy.context.Client;

import java.util.List;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class StatusStrategy
 * @since 11/21/2022 - 10.25
 **/
public interface StatusStrategy {
    void pass(Client client, List<Client> queue);
}
