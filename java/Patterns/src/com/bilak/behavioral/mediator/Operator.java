package com.bilak.behavioral.mediator;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Operator
 * @since 11/13/2022 - 12.01
 **/
public class Operator extends User {
    public Operator(String name, ChatroomMediator mediator) {
        super(name, mediator);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Sent from operator: " + message);
        mediator.sendMessage(message, "operator");
    }

    @Override
    public void receiveMessage(String message, String sender) {
        System.out.print("To an operator: ");
        super.receiveMessage(message, sender);
    }
}
