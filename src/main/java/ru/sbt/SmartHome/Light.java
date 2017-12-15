package ru.sbt.smartHome;

/**
 * Created by user on 15.12.2017.
 */
public class Light implements Actionable {
    private boolean isOn;
    private final String id;

    public boolean isOn() {return isOn;}
    public String getId() {return id;}
    public void setOn(boolean on) {isOn = on;}
    public Light(String id, boolean isOn) {
        this.id = id;
        this.isOn = isOn;
    }

    @Override
    public void executeAction(Action action) {action.execute(this);}
}
