package com.shashank.event_management_service.repositories;

import com.shashank.event_management_service.entities.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {
}
