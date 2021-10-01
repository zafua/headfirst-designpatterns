package org.umutzafer.headfirst.designpatterns.statepattern;

import org.umutzafer.headfirst.designpatterns.statepattern.state.*;

public class GumballMachine {
    private HasQuarterState hasQuarterState;
    private NoQuarterState noQuarterState;
    private SoldOutState soldOutState;
    private SoldState soldState;

    private State state;
    private int count = 0;

    public GumballMachine(int count) {
        this.hasQuarterState = new HasQuarterState(this);
        this.noQuarterState = new NoQuarterState(this);
        this.soldOutState = new SoldOutState(this);
        this.soldState = new SoldState(this);

        this.count = count;
        if(this.count > 0)
            this.state = noQuarterState;
        else
            this.state = soldOutState;
    }

    public void releaseBall() {
        System.out.println("You get your gumball");
        if(count>0)
            count = count - 1;
    }

    public void insertQuarter(){
        this.state.insertQuarter();
    }

    public void ejectQuarter(){
        this.state.ejectQuarter();
    }

    public void turnCrank(){
        this.state.turnCrank();
        this.state.dispense();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public HasQuarterState getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(HasQuarterState hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public NoQuarterState getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(NoQuarterState noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public SoldOutState getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(SoldOutState soldOutState) {
        this.soldOutState = soldOutState;
    }

    public SoldState getSoldState() {
        return soldState;
    }

    public void setSoldState(SoldState soldState) {
        this.soldState = soldState;
    }
}
