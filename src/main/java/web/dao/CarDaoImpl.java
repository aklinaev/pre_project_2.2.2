package web.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Repository
@Component
public class CarDaoImpl implements CarDao {
    List<Car> carList = new ArrayList<>();

    {
        carList.add(new Car(1, "bmw 3 M competiton", 2018));
        carList.add(new Car(2, "bmw 5 M competiton", 2021));
        carList.add(new Car(3, "porsche panamera", 2022));
        carList.add(new Car(4, "porsche 911", 2021));
        carList.add(new Car(5, "Yahta", 2017));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count >= 5) {
            return carList;
        }
        return carList.subList(0, count);
    }
}