package com.shashank.event_management_service.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Participant extends AbstractEntity {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    private Boolean checkedIn;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(referencedColumnName = "ID", nullable = false, updatable = false)
    private Event event;
}
