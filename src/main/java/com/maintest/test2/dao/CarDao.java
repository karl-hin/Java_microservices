package com.maintest.test2.dao;

import com.maintest.test2.model.Car;

import java.util.List;

public interface CarDao {
    public List<Car> findAll();

    public Car findById(int id);

    public Car addNewCar(int id, String type, String marque, String color);

    public Car save(Car car);

    public Car update(int id);

    public Car deleteById(Car id);

    public Car addNewCarBis(Car car);
}
