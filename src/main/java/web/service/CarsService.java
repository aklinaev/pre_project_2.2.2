package web.service;

import web.model.Car;

import java.util.List;

public interface CarsService {
    public List<Car> getCars(int count);
}
