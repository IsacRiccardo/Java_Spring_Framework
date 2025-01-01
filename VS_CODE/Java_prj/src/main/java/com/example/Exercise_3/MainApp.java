package com.example.Exercise_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.Exercise_3.dao.CarDao;
import com.example.Exercise_3.model.Car;

import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        // Load Spring context and get the CarDao bean
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans_ex_3.xml");
        CarDao carDao = context.getBean(CarDao.class);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display menu options for user interaction
            System.out.println("\n=============================");
            System.out.println("      Car Management Menu");
            System.out.println("=============================");
            System.out.println("1. Add a new car");
            System.out.println("2. Delete a car");
            System.out.println("3. Search for a car");
            System.out.println("4. Display all cars");
            System.out.println("5. Display number of cars by brand");
            System.out.println("6. Display number of cars below 100,000 km");
            System.out.println("7. Display cars newer than 5 years");
            System.out.println("0. Exit");
            System.out.print("Please enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1: // Add a new car
                    System.out.println("\n--- Add a New Car ---");
                    Car newCar = new Car();
                    System.out.print("Enter registration number: ");
                    newCar.setRegistrationNumber(scanner.nextLine());
                    System.out.print("Enter brand: ");
                    newCar.setBrand(scanner.nextLine());
                    System.out.print("Enter year of fabrication: ");
                    newCar.setYearOfFabrication(scanner.nextInt());
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter color: ");
                    newCar.setColor(scanner.nextLine());
                    System.out.print("Enter kilometers: ");
                    newCar.setKilometers(scanner.nextInt());
                    carDao.insertCar(newCar);
                    System.out.println("Car added successfully!\n");
                    break;

                case 2: // Delete a car
                    System.out.println("\n--- Delete a Car ---");
                    System.out.print("Enter registration number to delete: ");
                    String regNumber = scanner.nextLine();
                    carDao.deleteCar(regNumber);
                    System.out.println("Car with registration number " + regNumber + " deleted.\n");
                    break;

                case 3: // Search for a car
                    System.out.println("\n--- Search for a Car ---");
                    System.out.print("Enter registration number to search: ");
                    regNumber = scanner.nextLine();
                    Car car = carDao.getCarByRegistration(regNumber);
                    if (car != null) {
                        // Displaying car characteristics
                        System.out.println("Car found:");
                        System.out.println("Registration Number: " + car.getRegistrationNumber());
                        System.out.println("Brand: " + car.getBrand());
                        System.out.println("Year of Fabrication: " + car.getYearOfFabrication());
                        System.out.println("Color: " + car.getColor());
                        System.out.println("Kilometers: " + car.getKilometers());
                        System.out.println("-------------------------------\n");
                    } else {
                        System.out.println("No car found with the registration number: " + regNumber + ".\n");
                    }
                    break;

                case 4: // Display all cars
                    System.out.println("\n--- Display All Cars ---");
                    List<Car> cars = carDao.getAllCars();
                    if (!cars.isEmpty()) {
                        for (Car c : cars) {
                            System.out.println("Registration Number: " + c.getRegistrationNumber());
                            System.out.println("Brand: " + c.getBrand());
                            System.out.println("Year of Fabrication: " + c.getYearOfFabrication());
                            System.out.println("Color: " + c.getColor());
                            System.out.println("Kilometers: " + c.getKilometers());
                            System.out.println("-------------------------------");
                        }
                        System.out.println();
                    } else {
                        System.out.println("No cars available in the database.\n");
                    }
                    break;

                case 5: // Display number of cars by brand
                    System.out.println("\n--- Display Number of Cars by Brand ---");
                    System.out.print("Enter brand: ");
                    String brand = scanner.nextLine();
                    int count = carDao.countCarsByBrand(brand);
                    System.out.println("Number of cars with brand " + brand + ": " + count + "\n");
                    break;

                case 6: // Display number of cars below 100,000 km
                    System.out.println("\n--- Display Number of Cars Below 100,000 km ---");
                    int countBelow100K = carDao.countCarsBelow100K();
                    System.out.println("Number of cars with less than 100,000 km: " + countBelow100K + "\n");
                    break;

                case 7: // Display cars newer than 5 years
                    System.out.println("\n--- Display Cars Newer Than 5 Years ---");
                    List<Car> newerCars = carDao.getCarsNewerThan5Years();
                    if (!newerCars.isEmpty()) {
                        for (Car c : newerCars) {
                            System.out.println("Registration Number: " + c.getRegistrationNumber());
                            System.out.println("Brand: " + c.getBrand());
                            System.out.println("Year of Fabrication: " + c.getYearOfFabrication());
                            System.out.println("Color: " + c.getColor());
                            System.out.println("Kilometers: " + c.getKilometers());
                            System.out.println("-------------------------------");
                        }
                        System.out.println();
                    } else {
                        System.out.println("No cars newer than 5 years found.\n");
                    }
                    break;

                case 0: // Exit
                    System.out.println("\nExiting...\n");
                    return;

                default:
                    System.out.println("\nInvalid choice. Please try again.\n");
            }
        }
    }
}
