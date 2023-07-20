package com.example.Vaccify.Model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Entity
public class Certificate{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String certificateNo;

    private String message;

    @OneToOne
    @JoinColumn
    private Person person;
}