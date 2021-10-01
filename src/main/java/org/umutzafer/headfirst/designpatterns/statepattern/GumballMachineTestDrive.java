package org.umutzafer.headfirst.designpatterns.statepattern;

public class GumballMachineTestDrive {
    public static void main(String[] args){
        GumballMachine machine = new GumballMachine(5);

        machine.insertQuarter();
        machine.insertQuarter();
        machine.turnCrank();

        machine.insertQuarter();
        machine.ejectQuarter();
        machine.turnCrank();

        machine.insertQuarter();
        machine.turnCrank();

        machine.turnCrank();

        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();

        machine.insertQuarter();
        machine.turnCrank();


        System.out.println(machine.getState().toString());
        System.out.println(machine.getCount());
    }
}
