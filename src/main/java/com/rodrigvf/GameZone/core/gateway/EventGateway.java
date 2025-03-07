package com.rodrigvf.GameZone.core.gateway;

import com.rodrigvf.GameZone.core.entities.Event;

import java.util.List;
import java.util.Optional;

public interface EventGateway {

    Event createEvent(Event event);

    List<Event> getAllEvents();

    boolean existsByIdentifier(String identifier);

    Optional<Event> filterByIdentifier(String identifier);
}
