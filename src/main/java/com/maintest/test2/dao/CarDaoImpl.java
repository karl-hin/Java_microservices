package com.maintest.test2.dao;

import com.maintest.test2.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    public List<Car> cars = new ArrayList<>();

    private Integer id;
    private String type;
    private String marque;
    private String color;

    public CarDaoImpl(Integer id, String type, String marque, String color) {
    }

    public CarDaoImpl() {
        cars.add(new Car(10, new String("Diablo"), new String("Lamborghini"), new String("Black")));
        cars.add(new Car(20, new String("class A"), new String("Mercedes"), new String("white")));
        cars.add(new Car(30, new String("DB11"), new String("Aston Martin"), new String("red")));
    }


    @Override
    public List<Car> findAll() {

        return cars;
    }

    @Override
    public Car findById(int id) {
        for (Car testGetId : cars) {
            if (testGetId.getId() == id) {
                return testGetId;
            }
        }
        return null;
    }

    @Override
    public Car save(Car car) {
        cars.add(car);
        return null;
    }

    @Override
    public Car update(int id) {
        return null;
    }

    @Override
    public Car deleteById(Car id) {
        return null;
    }

    @Override
    public Car addNewCarBis(Car car) {
        cars.add(car);
        return car;
    }

    @Override
    public Car addNewCar(int id, String type, String marque, String color) {
        Car firstCar = new Car(id, type, marque, color);
        cars.add(firstCar);
        return this.findById(id);
    }
}
