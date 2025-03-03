package com.rodrigvf.GameZone.infra.dtos;

import com.rodrigvf.GameZone.core.enumns.Status;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record EventDto(
        Long id,
        String identifier,
        String name,
        String description,
        String organizer,
        String game,
        Status status,
        int maxParticipants,
        LocalDateTime startDate,
        LocalDateTime endDate,
        String bannerImgUrl,
        String streamUrl,
        String discordUrl
) {
}
