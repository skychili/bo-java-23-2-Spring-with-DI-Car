package de.neuefische.bojava232springwithdicar;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor

public class CarService {
    private final CarRepository carRepository;

    public void addCar(Car car) {
        carRepository.addCar(car);
    }

    public List<Car> getCars() {
        return carRepository.getCars();
    }

    public void deleteById(String id) {
        carRepository.deleteById(id);
    }

    public void updateById(String id, Car car) {
        carRepository.updateById(id, car);
    }
}
