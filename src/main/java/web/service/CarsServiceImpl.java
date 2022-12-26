package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarsServiceImpl implements CarsService {


    private final CarDaoImpl carDao;

    @Autowired
    public CarsServiceImpl(CarDaoImpl carDao) {
        this.carDao = carDao;
    }


    @Override
    public List<Car> getCars(int count) {
        return carDao.getCars(count);
    }
}
