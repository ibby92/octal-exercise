package ca.uwaterloo.cs446;

public class NumberSubject extends Subject {

    private int state;

    public NumberSubject(int state) {
        this.state = state;
    }

    @Override
    public int getState() {
        return this.state;
    }

    @Override
    public void setState(int state) {
        this.state = state;
        sendNotice();
    }
}
