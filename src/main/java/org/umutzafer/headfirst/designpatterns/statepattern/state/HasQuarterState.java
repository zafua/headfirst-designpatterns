package org.umutzafer.headfirst.designpatterns.statepattern.state;

import org.umutzafer.headfirst.designpatterns.statepattern.GumballMachine;

public class HasQuarterState implements State{
    GumballMachine machine;

    public HasQuarterState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You already insert quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned!");
        machine.setState(machine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You cranked..!");
        machine.setState(machine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");
    }
}
