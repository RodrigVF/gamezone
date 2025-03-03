package com.rodrigvf.GameZone.infra.mappers;

import com.rodrigvf.GameZone.core.entities.Event;
import com.rodrigvf.GameZone.infra.persistence.EventEntity;
import org.springframework.stereotype.Component;

@Component
public class EventEntityMapper {

    public EventEntity toEntity(Event event) {
        return new EventEntity(
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


    public Event toDomain(EventEntity eventEntity) {
        return new Event(
                eventEntity.getId(),
                eventEntity.getIdentifier(),
                eventEntity.getName(),
                eventEntity.getDescription(),
                eventEntity.getOrganizer(),
                eventEntity.getGame(),
                eventEntity.getStatus(),
                eventEntity.getMaxParticipants(),
                eventEntity.getStartDate(),
                eventEntity.getEndDate(),
                eventEntity.getBannerImgUrl(),
                eventEntity.getStreamUrl(),
                eventEntity.getDiscordUrl()
        );
    }
}
