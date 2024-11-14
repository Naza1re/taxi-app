
package org.example.driverservice.controller;

import lombok.RequiredArgsConstructor;
import org.example.driverservice.model.Driver;
import org.example.driverservice.service.DriverService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/drivers")  // Рекомендуется использовать общий префикс для всех эндпоинтов
public class DriverController {
    private final DriverService driverService;

    // Получение водителя по ID
    @GetMapping("/id/{id}")
    public Driver getDriverById(@PathVariable Long id) {
        return driverService.getDriverById(id);
    }

    // Создание водителя
    @PostMapping("/create/driver")
    @ResponseStatus(HttpStatus.CREATED)
    public Driver createDriver(@RequestBody Driver driver) {
        return driverService.createDriver(driver);
    }

    // Обновление водителя
    @PutMapping("/{id}/update")
    public Driver updateDriver(@PathVariable Long id, @RequestBody Driver driver) {
        return driverService.updateDriver(id, driver);
    }

    // Удаление водителя
    @DeleteMapping("/{id}/delete")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteDriver(@PathVariable Long id) {
        driverService.deleteDriver(id);
    }

    // Обновление стутуса доступа
    @PutMapping("/{id}/update/available")
    public Driver updateStatusDriver(@PathVariable Long id) {
        return driverService.updateStatusDriver(id);
    }

    // Получение всех доступных водителей
    @GetMapping("/drivers/available")
    public List<Driver> getAvailableDrivers() {
        return driverService.getAvailableDrivers();
    }
}

