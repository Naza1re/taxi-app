package org.example.rideservice.service;

import lombok.RequiredArgsConstructor;
import org.example.rideservice.model.Ride;
import org.example.rideservice.repository.RideRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RideService {
    private final RideRepository rideRepository;

    public Ride getRideById(Long id) {
        return rideRepository.findById(id).orElse(null);
    }

    public Ride createRide(Ride ride) {
        return rideRepository.save(ride);
    }


}
