package com.example.Vaccify.Model;

import com.example.Vaccify.Enum.DoseType;
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
public class Dose{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String doseId;

    @CreationTimestamp
    private Date doseDate;

    @Enumerated(EnumType.STRING)
    private DoseType doseType;

    @ManyToOne
    @JoinColumn
    private Person person;
}