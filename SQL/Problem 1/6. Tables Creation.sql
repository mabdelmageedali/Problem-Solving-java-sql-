CREATE DATABASE SunriseMedicalClinic
CHARACTER SET utf8mb4
COLLATE utf8mb4_unicode_ci;

USE SunriseMedicalClinic;

CREATE TABLE Department (
    id INT PRIMARY KEY AUTO_INCREMENT,
    dep_name VARCHAR(30) UNIQUE,
    location VARCHAR(100),
    budget DECIMAL(10,2),
    manager_id INT UNIQUE
);

CREATE TABLE Doctor (
    id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(20),
    last_name VARCHAR(20),
    specialty VARCHAR(30),
    phone_number VARCHAR(15),
    hire_date DATE,
    dep_id INT NOT NULL
);


ALTER TABLE Doctor
ADD CONSTRAINT fk_doctor_department
FOREIGN KEY (dep_id) REFERENCES Department(id);


ALTER TABLE Department
ADD CONSTRAINT fk_department_manager
FOREIGN KEY (manager_id) REFERENCES Doctor(id);


CREATE TABLE Patient (
    id INT PRIMARY KEY AUTO_INCREMENT,
    patient_name VARCHAR(50),
    gender VARCHAR(5),
    birth_date DATE
);

CREATE TABLE Patient_Phone (
    phone_id INT PRIMARY KEY AUTO_INCREMENT,
    patient_id INT,
    phone_number VARCHAR(15),
    FOREIGN KEY (patient_id) REFERENCES Patient(id) ON DELETE CASCADE
);


CREATE TABLE Referral  (
    id INT PRIMARY KEY AUTO_INCREMENT,
    pateint_id INT,
    referring_doctor_id INT ,
    referred_doctor_id INT,
    referring_date DATE,
	FOREIGN KEY (pateint_id) REFERENCES Patient(id),
    FOREIGN KEY (referring_doctor_id) REFERENCES Doctor(id),
	FOREIGN KEY (referred_doctor_id) REFERENCES Doctor(id),
    -- insure about no one can refere patient from a doctor to the same doctor
    CONSTRAINT force_different_doctor CHECK (referring_doctor_id <>referred_doctor_id)
);


CREATE TABLE Insurance (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    converage_percentage int
);

ALTER TABLE Patient 
ADD COLUMN insurance_id INT,
ADD COLUMN policy_number VARCHAR(30);

ALTER TABLE Patient
ADD CONSTRAINT fk_patient_insurance
FOREIGN KEY (insurance_id) REFERENCES Insurance(id) ON DELETE SET NULL;

CREATE TABLE Appointments(
	id INT PRIMARY KEY AUTO_INCREMENT,
    appointment_date DATE NOT NULL,
    appointment_time TIME NOT NULL,
    room_number INT NOT NULL,
    appointment_status VARCHAR(10) DEFAULT 'scheduled',
    doctor_id INT NOT NULL,
    patient_id INT NOT NULL,
    FOREIGN KEY (doctor_id) REFERENCES Doctor(id) ON DELETE CASCADE,
    FOREIGN KEY (patient_id) REFERENCES Patient(id) ON DELETE CASCADE,
    CONSTRAINT unique_doctor_time_room UNIQUE (appointment_date, appointment_time, room_number)
);

CREATE TABLE Prescription(
	appointment_id INT PRIMARY KEY, -- comming from the Strong entity to identify the week entity
    prescription_date DATE NOT NULL,
    dosage_instructions TEXT,
    FOREIGN KEY (appointment_id) REFERENCES Appointments(id) ON DELETE CASCADE
);

CREATE TABLE Medicine(
	medicine_code VARCHAR(20) PRIMARY KEY,
    medicine_name VARCHAR(30) ,
    manufacturer VARCHAR(30),
    price INT 
);

CREATE TABLE Prescription_Contains_Medicine(
	appointment_id INT,
    m_code VARCHAR(50),
    quantity INT,
    duration VARCHAR(50),
    PRIMARY KEY (appointment_id, m_code),
    FOREIGN KEY (appointment_id) REFERENCES Prescription(appointment_id) ON DELETE CASCADE,
    FOREIGN KEY (m_code) REFERENCES Medicine(medicine_code) ON DELETE CASCADE
);















