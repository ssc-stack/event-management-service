package com.shashank.event_management_service.repositories;

import com.shashank.event_management_service.entities.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizerRepository extends JpaRepository<Organizer, Long> {
}
