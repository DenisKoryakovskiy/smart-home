package ru.sbt.alarmSystem;

import ru.sbt.sensorEvent.SensorEvent;

/**
 * Created by User24 on 15.12.2017.
 */
public interface AlarmSystemState {
    void turnOn();
    void onSensor(SensorEvent sensorEvent);
    void turnOff();
    void typeCorrectPassword();
    void typeIncorrectPassword();
}

