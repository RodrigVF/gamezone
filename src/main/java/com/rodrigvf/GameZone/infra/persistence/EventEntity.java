package com.rodrigvf.GameZone.infra.persistence;

import com.rodrigvf.GameZone.core.enumns.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "tb_events")
public class EventEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String identifier;
    private String name;
    private String description;
    private String organizer;
    private String game;
    @Enumerated(EnumType.STRING)
    private Status status;
    @Column(name = "max_participants")
    private int maxParticipants;
    @Column(name = "start_date")
    private LocalDateTime startDate;
    @Column(name = "end_date")
    private LocalDateTime endDate;
    @Column(name = "banner_img_url")
    private String bannerImgUrl;
    @Column(name = "stream_url")
    private String streamUrl;
    @Column(name = "discord_url")
    private String discordUrl;

}
