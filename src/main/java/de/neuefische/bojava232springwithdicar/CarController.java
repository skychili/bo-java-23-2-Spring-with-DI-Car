package de.neuefische.bojava232springwithdicar;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car")
@RequiredArgsConstructor
public class CarController {
    private final CarService carService;

    @PostMapping
    public void post(@RequestBody Car car) {
        carService.addCar(car);
    }

    @GetMapping
    public List<Car> get() {
        return carService.getCars();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id) {
        carService.deleteById(id);
    }

    @PutMapping("/api/car/{id}")
    public void putById(@PathVariable String id, @RequestBody Car car) {
        carService.updateById(id, car);
    }
}
