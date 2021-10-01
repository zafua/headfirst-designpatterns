package org.umutzafer.headfirst.designpatterns.statepattern.state;

import org.umutzafer.headfirst.designpatterns.statepattern.GumballMachine;

public class SoldOutState implements State{
    GumballMachine machine;

    public SoldOutState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Sorry sold out!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You cant eject, you havent insert yet!");

    }

    @Override
    public void turnCrank() {
        System.out.println("You cranked, but sold out!");

    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");

    }
}
