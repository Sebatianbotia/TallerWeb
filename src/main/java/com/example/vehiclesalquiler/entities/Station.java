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
@Table(name = "stations")
public class Station {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String name;
    @Column (nullable = false)
    private String city;
    @Column (nullable = false)
    private String address;

    @OneToMany (mappedBy = "station")
    private List<Vehicle> vehicles;



}
