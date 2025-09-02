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
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (nullable = false)
    private String fullname;
    @Column (nullable = false)
    private String email;
    @Column (nullable = false)
    private String phone;
    @Column (nullable = false)
    private String address;
    @OneToMany(mappedBy = "user")
    private List<Reservation> reservations;
    @OneToOne(optional = false)
    @JoinColumn(name = "driverLicense_id")
    private DriverLicense driverLicense;
}
