package com.rodrigvf.GameZone.core.entities;

import com.rodrigvf.GameZone.core.enumns.Status;

import java.time.LocalDateTime;

public record Event(
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
