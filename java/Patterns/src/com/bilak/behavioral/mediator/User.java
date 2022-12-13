package com.bilak.behavioral.mediator;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class User
 * @since 11/13/2022 - 11.12
 **/
public abstract class User {
    private final String name;
    protected ChatroomMediator mediator;

    public User(String name, ChatroomMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public abstract void sendMessage(String message);

    public void receiveMessage(String message, String sender) {
        System.out.println(sender + " to " + name + ": '" + message + "'");
    }

    public String getName() {
        return name;
    }
}
