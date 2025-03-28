insert into address (id, address_line1, address_line2, city, postal_code)
            values   (1,'Leśnicka 6','Lokal 2','Częstochowa','80-400'),
                     (2,'Trzmielowicka 5','Lokal 4','Wrocław','60-400'),
                     (3,'Kazimierza Wielkiego 45','Mieszkanie 4','Wrocław','54-500'),
                     (4,'Strachowicka 8','Apartament 5','Wrocław','52-812'),
                     (5,'Duboisa 9','Mieszkania 3','Warszawa','98-404'),
                     (6,'Puławskiego 20','Mieszkanie 7','Łódź','67-450'),
                     (7,'Jagodowa 2','Apartament 2','Gdańsk','40-320'),
                     (8,'Wiśniowa 40','Mieszkania 18','Wrocław','56-200'),
                     (9,'Oliwkowa 32','Lokal 40','Oleśnica','54-500'),
                     (10,'Spiżowa 52','Lokal 24','Kielce','25-500');

insert into doctor (address_id, id, first_name, last_name, telephone_number, email, doctor_number, specialization)
            values (1, 1, 'Jan', 'Kowalski', '6039220123', 'Jankowalski00@gmail.com', 001, 'OCULIST'),
                   (2, 2, 'Jakub', 'Bizon', '602122923', 'Bizonowy123@gmail.com', 002, 'SURGEON'),
                   (3, 3, 'Jarosław', 'Stópka', '882144423', 'Bosastopka45@gmail.com', 003, 'DERMATOLOGIST'),
                   (4, 4, 'Mirosław', 'Świeca', '962144420', 'Zeswiecaszukaj28@gmail.com', 004, 'DERMATOLOGIST');

insert into patient (date_of_birth, address_id, id, email, first_name, last_name, patient_number, telephone_number)
            values (PARSEDATETIME('29.03.1989', 'dd.MM.yyyy'), 5, 1, 'arkadion99gamil@o2.pl', 'Arkadio', 'Morales', 01, 724120190);


insert into visit (doctor_id, id, patient_id, time, description)
            values (001, 1, 01, PARSEDATETIME('18:00', 'HH:mm'), 'badanie wstępne');


insert into medical_treatment (id, visit_id, description, type)
            values (1, 1, 'cancer', 'EKG');



