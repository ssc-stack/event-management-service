package com.shashank.event_management_service.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.Set;

@Data
@Entity
public class Organizer extends AbstractEntity {
    private String name;

    @OneToMany(mappedBy = "organizer")
    private Set<Event> events;
}
