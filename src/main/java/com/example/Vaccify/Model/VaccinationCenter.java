package com.example.Vaccify.Model;

import com.example.Vaccify.Enum.CenterType;
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
public class VaccinationCenter{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Enumerated(EnumType.STRING)
    private CenterType type;

    private String address;

    @OneToMany(mappedBy = "center", cascade = CascadeType.ALL)
    private List<Doctor> doctorList = new ArrayList<>();
}