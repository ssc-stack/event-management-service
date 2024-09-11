package com.shashank.event_management_service.repositories;

import com.shashank.event_management_service.entities.Venue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenueRepository extends JpaRepository<Venue, Long> {
}
