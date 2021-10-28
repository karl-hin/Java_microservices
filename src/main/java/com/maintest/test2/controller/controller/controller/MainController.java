package com.maintest.test2.controller.controller.controller;

import com.maintest.test2.dao.CarDao;
import com.maintest.test2.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private CarDao carDao;

    //api/carsList
    @RequestMapping(value = {"api/carsList"}, method = RequestMethod.GET)
    @ResponseBody
    public List<Car> CarsList() {

        return carDao.findAll();
    }

    //api/Car/{id}
    @GetMapping(value = "api/car/{id}")
    public Car showACar(@PathVariable int id) {

        return carDao.findById(id);
    }

    //api/carsList/addNewCar
    @PostMapping("api/carsList/addNewCar")
    public Car addNewCarBis(@RequestBody Car car) {

        return carDao.addNewCarBis(car);
    }

    //api/Car/{id}
    @PutMapping("api/car/{id}")
    public void updateCar(@PathVariable int id, @RequestBody Car carDetail) {
        Car car = carDao.findById(id);
        car.setMarque(carDetail.getMarque());
        car.setType(carDetail.getType());
        car.setColor(carDetail.getColor());
    }

    //
    @DeleteMapping("api/car/{id}")
    public void deleteCar(@PathVariable int id) {
        Car car = carDao.findById(id);
        carDao.deleteById(car);
    }
}
