package com.rodrigvf.GameZone.infra.persistence;

import com.rodrigvf.GameZone.core.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EventRepository extends JpaRepository<EventEntity, Long> {

    Optional<Event> findByIdentifier(String identifier);

}
