package com.carshowroom.carshowroom.car;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;





@RestController
public class CarController {


    @Autowired
    private CarService carservice;



    @RequestMapping("/cars")
    public List<Car> getAllCars(){
    return carservice.getAllCars();
        

    }


    @RequestMapping("/cars/{id}")
    public Car getCar(@PathVariable String id){
        return carservice.getCar(id);
    }


    @RequestMapping(value="/cars",method = RequestMethod.POST)
    public void addCar(@RequestBody Car car){
        carservice.addCar(car);
    }

    @RequestMapping(value="/cars/{id}", method=RequestMethod.PUT)
    public void updateCar(@PathVariable String id,@RequestBody Car car){
        carservice.updateCar(id, car);
    }

    @RequestMapping(value="/cars/{id}", method=RequestMethod.DELETE)
    public void deleteCar(@PathVariable String id){
        carservice.deleteCar(id);
    }


    
    
}
