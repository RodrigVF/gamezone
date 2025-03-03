package com.rodrigvf.GameZone.core.usecases;

import com.rodrigvf.GameZone.core.entities.Event;
import com.rodrigvf.GameZone.core.gateway.EventGateway;

public class CreateEventCaseImpl implements CreateEventCase {

    private final EventGateway eventGateway;

    public CreateEventCaseImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public Event execute(Event event) {
        return this.eventGateway.createEvent(event);
    }

}
