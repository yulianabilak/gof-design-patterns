package com.bilak.behavioral.strategy.strategies;

import com.bilak.behavioral.strategy.context.Client;

import java.util.List;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class StandardStrategy
 * @since 11/21/2022 - 10.48
 **/
public class StandardStrategy implements StatusStrategy {
    @Override
    public void pass(Client client, List<Client> queue) {
        queue.add(client);
    }
}
