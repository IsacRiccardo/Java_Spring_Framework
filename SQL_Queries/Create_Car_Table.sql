CREATE TABLE cars (
    registration_number VARCHAR(15) PRIMARY KEY,
    brand VARCHAR(50),
    year_of_fabrication INT,
    color VARCHAR(30),
    kilometers INT
);

INSERT INTO cars (registration_number, brand, year_of_fabrication, color, kilometers)
VALUES
('ABC123', 'Toyota', 2015, 'Red', 120000),
('DEF456', 'Honda', 2018, 'Blue', 80000),
('GHI789', 'Ford', 2017, 'Black', 100000),
('JKL012', 'BMW', 2020, 'White', 30000),
('MNO345', 'Audi', 2019, 'Silver', 50000),
('PQR678', 'Mercedes', 2018, 'Green', 70000),
('STU901', 'Hyundai', 2016, 'Yellow', 150000),
('VWX234', 'Nissan', 2021, 'Purple', 10000),
('YZA567', 'Chevrolet', 2022, 'Orange', 5000),
('BCD890', 'Mazda', 2014, 'Brown', 200000);

