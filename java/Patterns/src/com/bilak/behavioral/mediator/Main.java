package com.bilak.behavioral.mediator;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Main
 * @since 11/12/2022 - 16.45
 **/
public class Main {
    public static void main(String[] args) {
        ChatroomMediator mediator = new ChatroomMediator();
        User client = new Client("Scarlett", mediator);
        User operator = new Operator("John", mediator);

        mediator.setupConversation(client, operator);
        client.sendMessage("Hello I need help with renewing my subscription");
        operator.sendMessage("Hello, what is the problem?");
    }
}
