package com.example.Exercise_3.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;

import com.example.Exercise_3.model.Car;

import java.util.List;

public class CarDao {

    private final JdbcTemplate jdbcTemplate;

    // Constructor injection
    @Autowired
    public CarDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    // SQL queries
    private static final String INSERT_CAR = "INSERT INTO cars (registration_number, brand, year_of_fabrication, color, kilometers) VALUES (?, ?, ?, ?, ?)";
    private static final String DELETE_CAR = "DELETE FROM cars WHERE registration_number = ?";
    private static final String GET_CAR_BY_REGISTRATION = "SELECT * FROM cars WHERE registration_number = ?";
    private static final String GET_ALL_CARS = "SELECT * FROM cars";
    private static final String COUNT_CARS_BY_BRAND = "SELECT COUNT(*) FROM cars WHERE brand = ?";
    private static final String COUNT_CARS_BELOW_100K = "SELECT COUNT(*) FROM cars WHERE kilometers < 100000";
    private static final String GET_CARS_NEWER_THAN_5_YEARS = "SELECT * FROM cars WHERE year_of_fabrication > ?";

    // Insert a car
    public void insertCar(Car car) {
        jdbcTemplate.update(INSERT_CAR, car.getRegistrationNumber(), car.getBrand(), car.getYearOfFabrication(), car.getColor(), car.getKilometers());
    }

    // Delete a car by registration number
    public void deleteCar(String registrationNumber) {
        jdbcTemplate.update(DELETE_CAR, registrationNumber);
    }

    // Get a car by registration number
    public Car getCarByRegistration(String registrationNumber) {
    try 
    {
        return jdbcTemplate.queryForObject(GET_CAR_BY_REGISTRATION, new Object[]{registrationNumber}, carMapper);
    } catch (EmptyResultDataAccessException e) {
            // If no car is found, return null
            return null;
        }
    }


    // Get all cars
    public List<Car> getAllCars() {
        return jdbcTemplate.query(GET_ALL_CARS, carMapper);
    }

    // Count cars by brand
    public int countCarsByBrand(String brand) {
        return jdbcTemplate.queryForObject(COUNT_CARS_BY_BRAND, new Object[]{brand}, Integer.class);
    }

    // Get cars newer than 5 years
    public List<Car> getCarsNewerThan5Years() {
        int currentYear = java.time.LocalDate.now().getYear();
        return jdbcTemplate.query(GET_CARS_NEWER_THAN_5_YEARS, new Object[]{currentYear - 5}, carMapper);
    }

    // Get cars with kilometers below 100,000
    public List<Car> getCarsBelow100K() {
        return jdbcTemplate.query("SELECT * FROM cars WHERE kilometers < 100000", carMapper);
    }      
    
    public int countCarsBelow100K() {
        // Executes the SQL query to count cars with kilometers less than 100,000
        return jdbcTemplate.queryForObject(COUNT_CARS_BELOW_100K, Integer.class);
    }    


    // RowMapper to map result set to Car object
    private RowMapper<Car> carMapper = (rs, rowNum) -> {
        Car car = new Car();
        car.setRegistrationNumber(rs.getString("registration_number"));
        car.setBrand(rs.getString("brand"));
        car.setYearOfFabrication(rs.getInt("year_of_fabrication"));
        car.setColor(rs.getString("color"));
        car.setKilometers(rs.getInt("kilometers"));
        return car;
    };
}
