package com.example.hms1.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AppointmentId")
    private Long id;
    private String name ;
    private  String Doctor ;
    private LocalDateTime createdAt;
    private LocalDateTime scheduledAt;

    @PrePersist
    public void onCreate() {
        createdAt = LocalDateTime.now();
    }
}
