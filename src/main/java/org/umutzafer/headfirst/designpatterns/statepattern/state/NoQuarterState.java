package org.umutzafer.headfirst.designpatterns.statepattern.state;

import org.umutzafer.headfirst.designpatterns.statepattern.GumballMachine;

public class NoQuarterState implements State{
    GumballMachine machine;

    public NoQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        machine.setState(machine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("There is no quarter to eject!");
    }

    @Override
    public void turnCrank() {
        System.out.println("You must insert quarter first..!");
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
