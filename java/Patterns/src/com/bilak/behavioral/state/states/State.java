package com.bilak.behavioral.state.states;

import java.time.LocalDateTime;

/**
 * @author Yuliana
 * @version 1.0.0
 * @group 343(1)
 * @department PZKS
 * @project java
 * @class State
 * @since 11/13/2022 - 13.21
 **/
public interface State {
    void changeState();
    LocalDateTime getDate();
    double getPrice();
}
