package org.example.passengerservice.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.example.passengerservice.entity.Passenger;
import org.example.passengerservice.repository.PassengerRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PassengerService {

    private final PassengerRepository repository;



    public Passenger createPassenger(Passenger passenger) {
        Passenger savedPassenger = repository.save(passenger);
        return savedPassenger;
    }

    public List<Passenger> findAll() {
        return repository.findAll();
    }

    public Passenger getById(long id) {
        Passenger passenger = repository.findById(id).orElseThrow(
                ()-> new RuntimeException("Passenger Not Found")
        );
        return passenger;
    }


    public Passenger update(long id, Passenger passengerUpdate) {
        Passenger passenger = repository.findById(id).orElseThrow(
                ()-> new RuntimeException("Passenger Not Found")
        );
        passenger.setFirstName(passengerUpdate.getFirstName());
        passenger.setLastName(passengerUpdate.getLastName());
        passenger.setEmail(passengerUpdate.getEmail());
        passenger.setPhone(passengerUpdate.getPhone());
        passenger.setBalance(passengerUpdate.getBalance());
        return repository.save(passenger);
    }


    public void deleteById(long id) {

        repository.deleteById(id);
    }


}