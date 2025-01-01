package com.example.Exercise_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class Motorcycle extends Vehicle {
    private String bikeType;

    @Autowired
    public Motorcycle(@Value("15000.0") double price, @Value("180") int maxSpeed, @Value("Sport") String bikeType) {
        super(price, maxSpeed);
        this.bikeType = bikeType;
    }

    public Motorcycle() {}

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    public String getBikeType() {
        return bikeType;
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: " + bikeType;
    }
}
