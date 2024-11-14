package org.example.passengerservice.controller;

import lombok.RequiredArgsConstructor;
import org.example.passengerservice.entity.Passenger;
import org.example.passengerservice.repository.PassengerRepository;
import org.example.passengerservice.service.PassengerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/passengers")
@RequiredArgsConstructor
public class PassengerController {
    private final PassengerService passengerService;


    @GetMapping
    public List<Passenger> getAllPassengers() {
       return passengerService.findAll();
    }
    @GetMapping("/{id}")
    public Passenger getPassengerById(@PathVariable int id) {
        return passengerService.getById(id);
    }
    @PostMapping
    public Passenger addPassenger(@RequestBody Passenger passenger) {
        return passengerService.createPassenger(passenger);
    }
    @PutMapping("/{id}")
    public Passenger updatePassenger(@PathVariable int id,@RequestBody Passenger passenger) {
        return passengerService.update(id,passenger);
    }
    @DeleteMapping("/{id}")
    public void deletePassenger(@PathVariable int id) {
        passengerService.deleteById(id);
    }


}
