package ca.uwaterloo.cs446;

public class OctObserver extends Observer {

    private String octVal;
    private final Subject subject;

    public OctObserver(Subject Subject) {
        this.subject = Subject;
        Subject.attach(this);
    }

    public void update() {
        this.octVal = Integer.toOctalString(this.subject.getState());
    }

    public String getValue() {
        return this.octVal;
    }

}
