package org.example.rideservice.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table
@Data
@NoArgsConstructor
public class Ride {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String rideNo;
    private String rideDate;
    private String rideTime;
    private String rideLocation;
    private String rideDestination;
    private String rideComments;
    private boolean rideStatus;
}
