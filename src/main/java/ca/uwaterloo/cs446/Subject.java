package ca.uwaterloo.cs446;

import java.util.ArrayList;

public abstract class Subject {

    // Class ArrayList
    private ArrayList<Observer> observers;

    // No args Constructor
    public Subject(){
        this.observers = new ArrayList<Observer>();
    }

    // Public attach method - insert observer in ArrayList
    public void attach(Observer observer) {
        observers.add(observer);
    }

    // Public sendNotice method - call update method on each ArrayList element
    public void sendNotice() {
        for (Observer observer : this.observers) {
            observer.update();
        }
    }

    // Getters and setters

    // Abstract getter
    public abstract int getState();

    // Abstract setter
    public abstract void setState(int state);
}
