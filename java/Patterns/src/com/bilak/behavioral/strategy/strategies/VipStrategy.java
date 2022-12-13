package com.bilak.behavioral.strategy.strategies;

import com.bilak.behavioral.strategy.context.Client;
import com.bilak.behavioral.strategy.context.ClientStatus;

import java.util.List;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class VipStrategy
 * @since 11/21/2022 - 10.31
 **/
public class VipStrategy implements StatusStrategy {
    @Override
    public void pass(Client client, List<Client> queue) {
        for (int i = 0; i < queue.size(); i++) {
            if (queue.get(i).getStatus() == ClientStatus.STANDARD) {
                queue.add(i, client);
                return;
            }
        }
    }
}
