package com.example.vehiclesalquiler.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "driverLicenses")
public class DriverLicense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String licenseNumber;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private java.time.LocalDate description;
    @Column(nullable = false)
    private java.time.LocalDate expiresAt;

    @OneToOne(mappedBy = "driverLicense")
    private User user;

}
