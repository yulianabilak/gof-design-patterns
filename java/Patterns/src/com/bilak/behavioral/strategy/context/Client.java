package com.bilak.behavioral.strategy.context;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class Client
 * @since 11/21/2022 - 10.34
 **/
public class Client {
    private String name;
    private ClientStatus status;

    public Client(String name, ClientStatus status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClientStatus getStatus() {
        return status;
    }

    public void setStatus(ClientStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
