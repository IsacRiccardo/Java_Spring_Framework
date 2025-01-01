# !!-- Description is for the code located inside the Exercise_3 directory --!!
# Car Management System

This is a car management system built using Java and Spring JDBC. The program allows users to add, delete, search, and display car records stored in a MySQL database. The application supports operations like viewing statistics based on the car's brand, mileage, and age.

## What the Program Does

The car management system allows the user to interact with a MySQL database to perform various operations, including:

- **Add a car**: Insert new car details into the database.
- **Delete a car**: Remove a car record based on its registration number.
- **Search for a car**: Find a car by its registration number.
- **Display all cars**: List all cars stored in the database.
- **Display number of cars by brand**: Count how many cars belong to a particular brand.
- **Display statistics for cars below 100,000 km**: Count the cars with less than 100,000 kilometers driven.
- **Display cars newer than 5 years**: List all cars that are newer than 5 years.

The program uses Spring JDBC for database operations and connects to a MySQL database to persist car records.

## Prerequisites

- Java 8 or higher
- Maven
- MySQL database

## Installation

1. Clone the repository
2. Configure the `Beans_ex_3.xml` file with your database connection details.
3. Build the project using Maven: mvn clean install
4. Run the application



