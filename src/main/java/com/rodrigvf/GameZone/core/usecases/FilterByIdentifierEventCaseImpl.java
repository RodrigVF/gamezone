package com.rodrigvf.GameZone.core.usecases;

import com.rodrigvf.GameZone.core.entities.Event;
import com.rodrigvf.GameZone.core.gateway.EventGateway;
import com.rodrigvf.GameZone.infra.exceptions.DuplicatedEventException;
import com.rodrigvf.GameZone.infra.exceptions.NotFoundEventException;

import java.util.Optional;

public class FilterByIdentifierEventCaseImpl implements FilterByIdentifierEventCase {

    private final EventGateway eventGateway;

    public FilterByIdentifierEventCaseImpl(EventGateway eventGateway) {
        this.eventGateway = eventGateway;
    }

    @Override
    public Event execute(String identifier) {
        return this.eventGateway.filterByIdentifier(identifier)
                .orElseThrow(() -> new NotFoundEventException("Evento com identificador: " + identifier + " não foi encontrado"));
    }

}
