package com.shashank.event_management_service.repositories;

import com.shashank.event_management_service.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
