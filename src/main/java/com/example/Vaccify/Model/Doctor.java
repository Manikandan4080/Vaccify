package com.example.Vaccify.Model;

import com.example.Vaccify.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Entity
public class Doctor{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(unique = true)
    private String emailId;

    private int age;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @ManyToOne
    @JoinColumn
    private VaccinationCenter center;

    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    private List<Appointment> appointments = new ArrayList<>();
}