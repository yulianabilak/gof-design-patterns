package com.bilak.behavioral.mediator;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class ChatroomMediator
 * @since 11/13/2022 - 12.05
 **/
public class ChatroomMediator {
    private User client;
    private User operator;

    public ChatroomMediator() {
    }

    public void setupConversation(User client, User operator) {
        this.client = client;
        this.operator = operator;
    }

    public void sendMessage(String message, String sender) {
        if (sender.equals("client")) {
            operator.receiveMessage(message, client.getName());
        }
        else if (sender.equals("operator")) {
            client.receiveMessage(message, operator.getName());
        }
        else {
            throw new IllegalArgumentException("Unknown user");
        }
    }
}
