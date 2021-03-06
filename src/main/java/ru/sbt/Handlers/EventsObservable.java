package ru.sbt.eventHandler;

import ru.sbt.Application;
import ru.sbt.eventHandler.EventProcessor;
import ru.sbt.eventHandler.EventProcessorDecorator;
import ru.sbt.sensorEvent.SensorEvent;
import ru.sbt.smartHome.SmartHome;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by user on 15.12.2017.
 */
public abstract class EventsObservable {
    private Collection<EventProcessor> processors = new ArrayList<>();

    public EventsObservable(Collection<EventProcessor> processors) {this.processors = processors;}

    public void addHandler(EventProcessorDecorator eventProcessorDecorator){processors.add(eventProcessorDecorator);}

    public void onSensorEvent(SmartHome smartHome, SensorEvent sensorEvent){
        for (EventProcessor processor: processors) processor.processEvent(smartHome, sensorEvent);
    }

    public abstract void addHandler(EventProcessor eventProcessor);

    public void runEvent(SensorEvent event, SmartHome smartHome) {
        while (event != null) {
            System.out.println("Got event: " + event);
            this.onSensorEvent(smartHome, event);
            event = Application.getNextSensorEvent();
        }
    }
}
