package com.bilak.behavioral.mediator;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Client
 * @since 11/13/2022 - 11.07
 **/
public class Client extends User {
    public Client(String name, ChatroomMediator mediator) {
        super(name, mediator);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sent from client: " + message);
        mediator.sendMessage(message, "client");
    }

    @Override
    public void receiveMessage(String message, String sender) {
        System.out.print("To a client: ");
        super.receiveMessage(message, sender);
    }
}
