//package org.example.driverservice.controller;
//
//import lombok.RequiredArgsConstructor;
//import org.example.driverservice.model.Driver;
//import org.example.driverservice.service.DriverService;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequiredArgsConstructor
//public class DriverController {
//    private final DriverService driverService;
//
//    public DriverController(DriverService driverService) {
//        this.driverService = driverService;
//    }
//
//    @GetMapping("/id/{id}")
//    public Driver getDriverById(@PathVariable Long id) {
//        Driver driver = driverService.getDriverById(id);
//        return driver;
//    }
//
//    @PostMapping("/create/driver")
//    public Driver createDriver(@RequestBody Driver driver) {
//        Driver savedDriver = driverService.createDriver(driver);
//        return savedDriver;
//    }
//
//
//
//
//
//
//}
