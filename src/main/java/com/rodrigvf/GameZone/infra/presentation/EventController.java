package com.rodrigvf.GameZone.infra.presentation;

import com.rodrigvf.GameZone.core.entities.Event;
import com.rodrigvf.GameZone.core.usecases.CreateEventCase;
import com.rodrigvf.GameZone.core.usecases.GetEventCase;
import com.rodrigvf.GameZone.infra.dtos.EventDto;
import com.rodrigvf.GameZone.infra.mappers.EventDtoMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/event")
public class EventController {

    private final CreateEventCase createEventCase;
    private final GetEventCase getEventCase;
    private final EventDtoMapper eventDtoMapper;

    public EventController(CreateEventCase createEventCase, GetEventCase getEventCase, EventDtoMapper eventDtoMapper) {
        this.createEventCase = createEventCase;
        this.getEventCase = getEventCase;
        this.eventDtoMapper = eventDtoMapper;
    }

    @PostMapping()
    public EventDto createEvent(@RequestBody EventDto eventDto) {
        Event newEvent = createEventCase.execute(eventDtoMapper.toDomain(eventDto));
        return eventDtoMapper.toDto(newEvent);
    }

    @GetMapping()
    public List<EventDto> getAllEvents() {
        return getEventCase.execute()
                .stream()
                .map(eventDtoMapper::toDto)
                .toList();
    }
}
