package ru.sbt.eventHandler;

import ru.sbt.eventHandler.EventProcessor;
import ru.sbt.eventHandler.EventProcessorDecorator;
import ru.sbt.eventHandler.EventsObservable;

import java.util.Collection;

/**
 * Created by user on 15.12.2017.
 */
public class TimeMeasuringObservable extends EventsObservable {
    public TimeMeasuringObservable(Collection<EventProcessor> processors) {super(processors);}

    @Override
    public void addHandler(EventProcessor eventProcessor) {
        super.addHandler(new EventProcessorDecorator(eventProcessor));
    }
}
