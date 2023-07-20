package com.example.Vaccify.Model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Entity
public class Appointment{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String appointmentId;

    @CreationTimestamp
    private Date appointmentDate;

    @ManyToOne
    @JoinColumn
    private Person person;

    @ManyToOne
    @JoinColumn
    private Doctor doctor;
}
