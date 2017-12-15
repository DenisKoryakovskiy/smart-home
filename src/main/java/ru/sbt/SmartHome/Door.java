package ru.sbt.smartHome;

/**
 * Created by user on 15.12.2017.
 */
public class Door implements Actionable {
    private boolean isOpen;
    private final String id;

    public Door(boolean isOpen, String id) {
        this.isOpen = isOpen;
        this.id = id;
    }

    public void setOpen(boolean open) {isOpen = open;}
    public boolean isOpen() {return isOpen;}
    public String getId() {return id;}

    @Override
    public void executeAction(Action action) {action.execute(this);}
}
