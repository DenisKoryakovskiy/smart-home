package ru.sbt.eventHandler;

import ru.sbt.sensorEvent.SensorEvent;
import ru.sbt.smartHome.SmartHome;

/**
 * Created by user on 15.12.2017.
 */
@FunctionalInterface
public interface EventProcessor {
    void processEvent(SmartHome smartHome, SensorEvent event);
}
