package org.umutzafer.headfirst.designpatterns.statepattern.state;

import org.umutzafer.headfirst.designpatterns.statepattern.GumballMachine;

public class SoldState implements State{
    GumballMachine machine;

    public SoldState(GumballMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Already giving..!");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Already giving..!");
    }

    @Override
    public void dispense() {
        machine.releaseBall();
        if(machine.getCount()>0){
            machine.setState(machine.getNoQuarterState());
        } else {
            machine.setState(machine.getSoldOutState());
        }
    }
}
