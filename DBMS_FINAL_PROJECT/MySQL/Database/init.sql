CREATE DATABASE IF NOT EXISTS Fitness_Class_Booking_System;

USE Fitness_Class_Booking_System;

CREATE TABLE IF NOT EXISTS FitnessClass (
    ClassID INT AUTO_INCREMENT PRIMARY KEY,
    ClassName VARCHAR(50) NOT NULL,
    Instructor VARCHAR(50) NOT NULL,
    Schedule VARCHAR(100) NOT NULL
);

CREATE TABLE IF NOT EXISTS Student (
    StudentID INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(100) NOT NULL,
    StudentIDNumber VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS Booking (
    BookingID INT AUTO_INCREMENT PRIMARY KEY,
    StudentID INT,
    ClassID INT,
    FOREIGN KEY (StudentID) REFERENCES Student(StudentID),
    FOREIGN KEY (ClassID) REFERENCES FitnessClass(ClassID),
    UNIQUE (StudentID, ClassID)
);

INSERT INTO FitnessClass (ClassName, Instructor, Schedule) VALUES
('Yoga', 'Kori', 'Mon, Wed, Fri - 9:00 AM'),
('Zumba', 'Julius', 'Tue, Thu - 5:00 PM'),
('Cycling', 'Jessica', 'Mon, Fri - 7:00 AM'),
('Dance', 'Carlo', 'Sat - 3:00 PM');

INSERT INTO Student (Name, StudentIDNumber) VALUES
('Alice Johnson', 'S12345'),
('Bob Smith', 'S23456'),
('Charlie Brown', 'S34567');

INSERT INTO Booking (StudentID, ClassID) VALUES
(1, 1),
(2, 2),
(3, 3);
