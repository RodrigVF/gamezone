package com.rodrigvf.GameZone.infra.gateway;

import com.rodrigvf.GameZone.core.entities.Event;
import com.rodrigvf.GameZone.core.gateway.EventGateway;
import com.rodrigvf.GameZone.infra.mappers.EventEntityMapper;
import com.rodrigvf.GameZone.infra.persistence.EventEntity;
import com.rodrigvf.GameZone.infra.persistence.EventRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EventRepositoryGateway implements EventGateway {

    private final EventRepository eventRepository;
    private final EventEntityMapper eventEntityMapper;

    public EventRepositoryGateway(EventRepository eventRepository, EventEntityMapper eventEntityMapper) {
        this.eventRepository = eventRepository;
        this.eventEntityMapper = eventEntityMapper;
    }

    @Override
    public Event createEvent(Event event) {
        EventEntity entity = eventEntityMapper.toEntity(event);
        entity.setId(null);
        EventEntity newEvent = eventRepository.save(entity);
        return eventEntityMapper.toDomain(newEvent);
    }

    @Override
    public List<Event> getAllEvents() {
        return eventRepository.findAll()
                .stream()
                .map(eventEntityMapper::toDomain)
                .toList();
    }

}
