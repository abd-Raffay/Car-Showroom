package com.carshowroom.carshowroom.car;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public List<Car> getAllCars(){

        List<Car> cars=new ArrayList<>();
        carRepository.findAll().forEach(cars::add);
        return cars;

    }

    public Car getCar(String id) {
        return carRepository.findById(id).orElse(null); 
    }

    public void addCar(Car car){
        carRepository.save(car);
    }

    public void updateCar(String id,Car car){
        
        carRepository.save(car);

    }

    public void deleteCar(String id){

        carRepository.deleteById(id);

    }


}
