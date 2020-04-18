package web.service;

import web.model.Car;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

@org.springframework.stereotype.Service
public class Service {
    public List<Car> getMyListOfCar() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Bugatti", 454, 2020));
        cars.add(new Car("GTR", 320, 2002));
        cars.add(new Car("Lada", 900, 1978));
        return cars;
    }

}
