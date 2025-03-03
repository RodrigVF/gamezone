package com.rodrigvf.GameZone.infra.presentation;

import com.rodrigvf.GameZone.core.entities.Event;
import com.rodrigvf.GameZone.core.usecases.CreateEventCase;
import com.rodrigvf.GameZone.core.usecases.GetEventCase;
import com.rodrigvf.GameZone.infra.dtos.EventDto;
import com.rodrigvf.GameZone.infra.mappers.EventDtoMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public ResponseEntity<Map<String, Object>> createEvent(@RequestBody EventDto eventDto) {
        Event newEvent = createEventCase.execute(eventDtoMapper.toDomain(eventDto));
        Map<String, Object> response = new HashMap<>();
        response.put("Mensagem:", "Evento cadastrado com sucesso!");
        response.put("Dados do evento:", eventDtoMapper.toDto(newEvent));
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping()
    public List<EventDto> getAllEvents() {
        return getEventCase.execute()
                .stream()
                .map(eventDtoMapper::toDto)
                .toList();
    }
}
