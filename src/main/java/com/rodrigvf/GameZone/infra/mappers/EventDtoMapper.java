package com.rodrigvf.GameZone.infra.mappers;

import com.rodrigvf.GameZone.core.entities.Event;
import com.rodrigvf.GameZone.infra.dtos.EventDto;
import org.springframework.stereotype.Component;

@Component
public class EventDtoMapper {

    public Event toDomain(EventDto eventDto) {
        return new Event (
                eventDto.id(),
                eventDto.identifier(),
                eventDto.name(),
                eventDto.description(),
                eventDto.organizer(),
                eventDto.game(),
                eventDto.status(),
                eventDto.maxParticipants(),
                eventDto.startDate(),
                eventDto.endDate(),
                eventDto.bannerImgUrl(),
                eventDto.streamUrl(),
                eventDto.discordUrl()
        );
    }

    public EventDto toDto(Event event) {
        return new EventDto(
                event.id(),
                event.identifier(),
                event.name(),
                event.description(),
                event.organizer(),
                event.game(),
                event.status(),
                event.maxParticipants(),
                event.startDate(),
                event.endDate(),
                event.bannerImgUrl(),
                event.streamUrl(),
                event.discordUrl()
        );
    }

}
