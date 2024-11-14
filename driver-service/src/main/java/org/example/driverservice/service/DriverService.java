//package org.example.driverservice.service;
//
//import lombok.RequiredArgsConstructor;
//import org.example.driverservice.model.Driver;
//import org.example.driverservice.repository.DriverRepository;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class DriverService {
//    private final DriverRepository driverRepository;
//
//    public DriverService(DriverRepository driverRepository) {
//        this.driverRepository = driverRepository;
//
//    }
//
//    public Driver getDriverById(Long id) {
//        return driverRepository.findById(id).orElse(null);
//    }
//
//    public Driver createDriver(Driver driver) {
//        Driver newDriver = driverRepository.save(driver);
//        return newDriver;
//    }
//}
