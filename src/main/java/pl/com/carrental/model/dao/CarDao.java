package pl.com.carrental.model.dao;

import pl.com.carrental.model.Car;

import java.util.List;

public interface CarDao {
    void addCar(Car car);
    void deleteCar(Integer id);
    Car findById(Integer id);
    List<Car> findAllCars();

}
