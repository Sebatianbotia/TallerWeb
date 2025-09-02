package com.example.vehiclesalquiler.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "vehicles")
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (nullable = false)
    private String Plate;
    @Column (nullable = false)
    private String Model;
    @Column (nullable = false)
    private Integer year;
    @Column (nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn (name = "station_id")
    private Station station;

    @OneToMany (mappedBy = "vehicle")
    private List<Reservation> reservations;

}
