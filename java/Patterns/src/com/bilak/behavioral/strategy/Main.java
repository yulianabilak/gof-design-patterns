package com.bilak.behavioral.strategy;

import com.bilak.behavioral.strategy.context.Client;
import com.bilak.behavioral.strategy.context.ClientStatus;
import com.bilak.behavioral.strategy.context.Queue;
import com.bilak.behavioral.strategy.strategies.StandardStrategy;
import com.bilak.behavioral.strategy.strategies.StatusStrategy;
import com.bilak.behavioral.strategy.strategies.VipStrategy;

import java.util.Arrays;
import java.util.List;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Main
 * @since 11/19/2022 - 16.55
 **/
public class Main {
    public static void main(String[] args) {
        List<Client> clients = Arrays.asList(
                new Client("1", ClientStatus.STANDARD),
                new Client("2", ClientStatus.STANDARD),
                new Client("3", ClientStatus.VIP),
                new Client("4", ClientStatus.VIP),
                new Client("5", ClientStatus.STANDARD)
        );
        StatusStrategy strategy = null;
        Queue queue = new Queue(2, null);
        for (Client client : clients) {
            if (client.getStatus() == ClientStatus.STANDARD) {
                strategy = new StandardStrategy();
            }
            else if (client.getStatus() == ClientStatus.VIP) {
                strategy = new VipStrategy();
            }
            queue.setStrategy(strategy);
            queue.queue(client);
        }
        System.out.println(queue.getQueue());
    }
}
