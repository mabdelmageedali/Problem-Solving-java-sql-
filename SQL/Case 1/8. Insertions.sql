USE sunrisemedicalclinic;

INSERT INTO Department (dep_name, location, budget)
VALUES
('Cardiology', 'Building A Floor 1', 500000),
('Pediatrics', 'Building B Floor 2', 300000),
('Neurology', 'Building C Floor 1', 400000);

INSERT INTO Doctor (first_name, last_name, specialty, phone_number, hire_date, dep_id)
VALUES
('Ahmed', 'Ali', 'Cardiology', '01011111111', '2020-01-15', 1),
('Sara', 'Hassan', 'Pediatrics', '01022222222', '2021-03-20', 2),
('Mohamed', 'Khaled', 'Neurology', '01033333333', '2019-06-10', 3),
('Mona', 'Adel', 'Cardiology', '01044444444', '2022-09-05', 1),
('Omar', 'Youssef', 'Pediatrics', '01055555555', '2023-02-11', 2);

UPDATE Department
SET manager_id = 3
WHERE id = 1;

UPDATE Department
SET manager_id = 5
WHERE id = 2;

UPDATE Department
SET manager_id = 2
WHERE id = 3;


INSERT INTO Patient
(patient_name, gender, birth_date)
VALUES
('Ali Ahmed', 'Male', '1998-05-12'),
('Mariam Ali', 'Female', '2000-08-20'),
('Youssef Amr', 'Male', '1995-01-30'),
('Nour Adel', 'Female', '2002-11-15'),
('Khaled Mostafa', 'Male', '1990-03-18'),
('Aya Hassan', 'Female', '1999-07-25'),
('Omar Ahmed', 'Male', '2001-10-10'),
('Salma Ali', 'Female', '1997-12-05');

INSERT INTO Appointments
(appointment_date, appointment_time, room_number, appointment_status, doctor_id, patient_id)
VALUES
('2026-07-15', '09:00:00', 101, 'completed', 1, 1),
('2026-07-15', '10:00:00', 102, 'scheduled', 2, 2),
('2026-07-15', '11:30:00', 103, 'cancelled', 3, 3),

('2026-07-16', '09:30:00', 101, 'completed', 4, 4),
('2026-07-16', '12:00:00', 102, 'scheduled', 5, 5),
('2026-07-17', '13:00:00', 103, 'completed', 1, 6),

('2026-07-17', '14:30:00', 104, 'cancelled', 2, 7),
('2026-07-18', '10:30:00', 101, 'scheduled', 3, 8),

('2026-07-18', '15:00:00', 102, 'completed', 4, 1),
('2026-07-19', '16:00:00', 103, 'scheduled', 5, 2);


INSERT INTO Insurance
(name, converage_percentage)
VALUES
('Misr Insurance', 80),
('Health Care Plus', 90),
('Global Medical Insurance', 70);


UPDATE Patient
SET insurance_id = 3,
    policy_number = 'GMI-1001' -- policy_number must be different from patient to another
WHERE id = 1;


UPDATE Patient
SET insurance_id = 3,
    policy_number = 'GMI-1002'
WHERE id = 2;


UPDATE Patient
SET insurance_id = 2,
    policy_number = 'HCP-1001'
WHERE id = 3;


UPDATE Patient
SET insurance_id = 1,
    policy_number = 'MIS-1001'
WHERE id = 4;


UPDATE Patient
SET insurance_id = 1,
    policy_number = 'MIS-1002'
WHERE id = 5;


UPDATE Patient
SET insurance_id = 2,
    policy_number = 'HCP-1002'
WHERE id = 6;


UPDATE Patient
SET insurance_id = 2,
    policy_number = 'HCP-1003'
WHERE id = 7;


UPDATE Patient
SET insurance_id = 1,
    policy_number = 'MIS-1003'
WHERE id = 8;

INSERT INTO Medicine
(medicine_code, medicine_name, manufacturer, price)
VALUES
('MED001', 'Amoxicillin', 'Pfizer', 120),
('MED002', 'Augmentin', 'GSK', 200),
('MED003', 'Paracetamol', 'Sanofi', 50),
('MED004', 'Ciprofloxacin', 'Bayer', 150),
('MED005', 'Aspirin', 'Bayer', 40),
('MED006', 'PenicillinV', 'Pfizer', 90);

INSERT INTO Prescription
(appointment_id, prescription_date, dosage_instructions)
VALUES
(1, '2026-07-15', 'One tablet twice daily'),
(4, '2026-07-16', 'Two tablets after meal'),
(6, '2026-07-17', 'One capsule every 8 hours'),
(9, '2026-07-18', 'One tablet before sleep');


INSERT INTO Prescription_Contains_Medicine
(appointment_id, m_code, quantity, duration)
VALUES
(1, 'MED001', 20, '5 days'),
(1, 'MED003', 10, '3 days'),

(4, 'MED002', 15, '7 days'),

(6, 'MED004', 10, '5 days'),
(6, 'MED005', 20, '10 days'),

(9, 'MED006', 14, '7 days');


INSERT INTO Referral
(pateint_id, referring_doctor_id, referred_doctor_id, referring_date)
VALUES
(1, 1, 3, '2026-07-10'),
(2, 2, 5, '2026-07-11'),
(3, 4, 1, '2026-07-12'),
(6, 5, 2, '2026-07-13');



INSERT INTO Patient_Phone
(patient_id, phone_number)
VALUES
(1,'01090000001'),
(1,'01090000002'),
(2,'01090000003'),
(3,'01090000004'),
(4,'01090000005'),
(5,'01090000006'),
(6,'01090000007'),
(7,'01090000008'),
(8,'01090000009');

