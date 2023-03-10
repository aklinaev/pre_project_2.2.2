package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarsServiceImpl;

import java.util.List;


@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarsServiceImpl carsService;

    @Autowired
    public CarsController(CarsServiceImpl carsService) {
        this.carsService = carsService;
    }

    @GetMapping
    public String getCars(ModelMap model, @RequestParam(name = "count", required = false, defaultValue = "5") int count) {
        List<Car> cars = carsService.getCars(count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}

