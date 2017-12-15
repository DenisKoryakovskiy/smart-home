package ru.sbt.alarmSystem;

import ru.sbt.sensorEvent.SensorEvent;

public class AlarmSystem {
    private AlarmSystemState stateStrategy;
    private AlarmSystemStateEnum state;
    public AlarmSystem() {
        AlarmSystemState alarmSystemState = new AlarmSystemOffState(this);
        this.stateStrategy = alarmSystemState;
        this.state = AlarmSystemStateEnum.OFF;
    }
    public void setState(AlarmSystemStateEnum state) {this.state = state;}
    public void setStateStrategy(AlarmSystemState stateStrategy) {this.stateStrategy = stateStrategy;}
    public void turnOff() {stateStrategy.turnOff();}
    public void onSensor(SensorEvent sensorEvent) {stateStrategy.onSensor(sensorEvent);}
    public void typeCorrectPassword() {stateStrategy.typeCorrectPassword();}
    public void typeUncorrectPassword() {stateStrategy.typeIncorrectPassword();}
    public void turnOn() {stateStrategy.turnOn();}
    public AlarmSystemStateEnum getState() {return state;}
}
