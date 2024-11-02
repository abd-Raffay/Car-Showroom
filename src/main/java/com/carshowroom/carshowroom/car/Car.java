package com.carshowroom.carshowroom.car;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car {

    @Id
    private String id;
    private String make;
    private String model;
    private int price;

    public Car(){
        
    }


    public Car(String id, String make, String model, int price) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.price = price;
    }


    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
 
}
