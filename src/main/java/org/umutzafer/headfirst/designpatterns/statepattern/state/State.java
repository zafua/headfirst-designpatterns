package org.umutzafer.headfirst.designpatterns.statepattern.state;

import org.umutzafer.headfirst.designpatterns.statepattern.GumballMachine;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
