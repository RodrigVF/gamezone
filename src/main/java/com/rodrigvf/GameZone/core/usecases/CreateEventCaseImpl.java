package com.rodrigvf.GameZone.core.usecases;

import com.rodrigvf.GameZone.core.entities.Event;
import com.rodrigvf.GameZone.core.gateway.EventGateway;
import com.rodrigvf.GameZone.infra.exceptions.DuplicatedEventException;

public class CreateEventCaseImpl implements CreateEventCase {

    private final EventGateway eventGateway;

    public CreateEventCaseImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public Event execute(Event event) {
        if (eventGateway.existsByIdentifier(event.identifier())) {
            throw new DuplicatedEventException("O identificador: " + event.identifier() + " já está em uso para outro evento.");
        }

        return this.eventGateway.createEvent(event);
    }

}
