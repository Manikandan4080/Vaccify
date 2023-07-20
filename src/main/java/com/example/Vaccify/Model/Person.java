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
public class Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(unique = true)
    private String emailId;

    private int age;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    private String mobile;

    private boolean dose1Taken;
    private boolean dose2Taken;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    List<Dose> doses = new ArrayList<>();

    @OneToOne(mappedBy = "person")
    private Certificate certificate;

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<Appointment> appointments = new ArrayList<>();

}
