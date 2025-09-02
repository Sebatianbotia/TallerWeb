package com.example.vehiclesalquiler.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "reservations")
public class Reservation {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private java.time.OffsetDateTime pickUpAt;
    @Column(nullable = false)
    private java.time.OffsetDateTime returnAt;
    @Column(nullable = false)
    private java.math.BigDecimal totalPrice;
    @Column (nullable = false)
    private String status;

    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


}
