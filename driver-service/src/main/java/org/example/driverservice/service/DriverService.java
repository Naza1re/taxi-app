package org.example.driverservice.service;

import lombok.RequiredArgsConstructor;
import org.example.driverservice.model.Driver;
import org.example.driverservice.repository.DriverRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DriverService {
    private final DriverRepository driverRepository;

    // Получение водителя по ID
    public Driver getDriverById(Long id) {
        return driverRepository.findById(id).orElse(null);
    }

    // Создание нового водителя
    public Driver createDriver(Driver driver) {
        Driver newDriver = driverRepository.save(driver);
        return newDriver;
    }

    // Обновление водителя
    public Driver updateDriver(Long id, Driver driver) {
        if (driverRepository.existsById(id)) {
            driver.setId(id); // Устанавливаем ID водителя для обновления
            return driverRepository.save(driver);
        }
        return null; // Возвращаем null, если водитель не найден
    }

    // Удаление водителя
    public void deleteDriver(Long id) {
        if (driverRepository.existsById(id)) {
            driverRepository.deleteById(id);
        }
    }

    // Обновление статуса водителя
    public Driver updateStatusDriver(Long id) {
        return driverRepository.findById(id).map(driver -> {
            driver.setAvailable(true); // Устанавливаем поле available на true
            return driverRepository.save(driver); // Сохраняем изменения и возвращаем обновлённого водителя
        }).orElse(null); // Возвращаем null, если водитель не найден
    }


    // Вернуть список доступных водителей
    public List<Driver> getAvailableDrivers() {
        return driverRepository.findAllByAvailableTrue();
    }
}
