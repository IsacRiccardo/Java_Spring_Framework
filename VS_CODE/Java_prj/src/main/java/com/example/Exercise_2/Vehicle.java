package com.example.Exercise_2;


class Vehicle {
    private double price;
    private int maxSpeed;

    public Vehicle(double price, int maxSpeed) {
        this.price = price;
        this.maxSpeed = maxSpeed;
    }

    public Vehicle() {}

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return "Price: " + price + ", Max Speed: " + maxSpeed + " km/h";
    }
}