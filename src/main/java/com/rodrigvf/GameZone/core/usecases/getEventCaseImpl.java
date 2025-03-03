package com.rodrigvf.GameZone.core.usecases;

import com.rodrigvf.GameZone.core.entities.Event;
import com.rodrigvf.GameZone.core.gateway.EventGateway;

import java.util.List;

public class GetEventCaseImpl implements GetEventCase {

    private final EventGateway eventGateway;

    public GetEventCaseImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public List<Event> execute() {
        return this.eventGateway.getAllEvents();
    }

}
