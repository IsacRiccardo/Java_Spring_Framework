package com.example.Exercise_2;

class AutoVehicle extends Vehicle {
    private String brand;
    private int yearOfFabrication;

    public AutoVehicle(double price, int maxSpeed, String brand, int yearOfFabrication) {
        super(price, maxSpeed);
        this.brand = brand;
        this.yearOfFabrication = yearOfFabrication;
    }

    public AutoVehicle() {}

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setYearOfFabrication(int yearOfFabrication) {
        this.yearOfFabrication = yearOfFabrication;
    }

    public int getYearOfFabrication() {
        return yearOfFabrication;
    }

    @Override
    public String toString() {
        return super.toString() + ", Brand: " + brand + ", Year of Fabrication: " + yearOfFabrication;
    }
}