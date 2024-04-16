package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car("Lamborghini", 350, 1964));
        cars.add(new Car("Ferrari", 360, 1999));
        cars.add(new Car("Porsche", 911, 1975));
        cars.add(new Car("LandCruiser", 200, 2020));
        cars.add(new Car("VAZ", 2106, 1976));
    }

    @Override
    public List<Car> cars(Integer count) {
        if (count == null || count >= cars.size()) {
            return cars;
        } else {
            return cars.stream().limit(count).toList();
        }
    }
}
