package ca.uwaterloo.cs446;

public abstract class Observer {
    public Observer() {
    }

    public abstract void update();

    public abstract String getValue();

}
