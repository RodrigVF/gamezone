package com.rodrigvf.GameZone.core.gateway;

import com.rodrigvf.GameZone.core.entities.Event;

import java.util.List;

public interface EventGateway {

    Event createEvent(Event event);

    List<Event> getAllEvents();
}
