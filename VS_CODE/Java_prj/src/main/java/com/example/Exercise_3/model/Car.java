package com.example.Exercise_3.model;

public class Car {
    private String registrationNumber;
    private String brand;
    private int yearOfFabrication;
    private String color;
    private int kilometers;

    // Getters and setters
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfFabrication() {
        return yearOfFabrication;
    }

    public void setYearOfFabrication(int yearOfFabrication) {
        this.yearOfFabrication = yearOfFabrication;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    @Override
    public String toString() {
        return "Car{" +
               "registrationNumber='" + registrationNumber + '\'' +
               ", brand='" + brand + '\'' +
               ", yearOfFabrication=" + yearOfFabrication +
               ", color='" + color + '\'' +
               ", kilometers=" + kilometers +
               '}';
    }
}