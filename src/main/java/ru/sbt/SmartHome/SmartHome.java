package ru.sbt.smartHome;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by user on 15.12.2017.
 */
public class SmartHome implements Actionable {
    Collection<Room> rooms;

    public SmartHome() {rooms = new ArrayList<>();}
    public SmartHome(Collection<Room> rooms) {this.rooms = rooms;}
    public void addRoom(Room room) {rooms.add(room);}
    public Collection<Room> getRooms() {return rooms;}

    @Override
    public void executeAction(Action action) {
        action.execute(this);
        for (Room room : rooms) room.executeAction(action);
    }
}
