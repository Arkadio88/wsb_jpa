insert into address (id, address_line1, address_line2, city, postal_code)
            values   (1,'Lesnicka 6','Lokal 2','Czestochowa', '80-400'),
                     (2,'Trzmielowicka 5','Lokal 4','Wroclaw','66-666'),
                     (3,'Kazimierza Wielkiego 45','Mieszkanie 4','Wroclaw','54-500'),
                     (4,'Strachowicka 8','Apartament 5','Wroclaw','52-812'),
                     (5,'Duboisa 9','Mieszkania 3','Warszawa','98-404'),
                     (6,'Puławskiego 20','Mieszkanie 7','Lodz','67-450'),
                     (7,'Jagodowa 2','Apartament 2','Gdansk','40-320'),
                     (8,'Wisniowa 40','Mieszkania 18','Wroclaw','56-200'),
                     (9,'Oliwkowa 32','Lokal 40','Olesnica','54-500'),
                     (10,'Spizowa 52','Lokal 24','Kielce','25-500'),
                     (11,'Jaroslawska 1','Lokal 1','Poznan','35-450');

insert into doctor (address_id, id, first_name, last_name, telephone_number, email, doctor_number, specialization)
            values (1, 101, 'Jan', 'Kowalski', '6039220123', 'Jankowalski00@gmail.com', 1001, 'OCULIST'),
                   (2, 102, 'Jakub', 'Bizon', '602122923', 'Bizonowy123@gmail.com', 1002, 'SURGEON'),
                   (3, 103, 'Jarosław', 'Stópka', '882144423', 'Bosastopka45@gmail.com', 1003, 'DERMATOLOGIST'),
                   (4, 104, 'Mirosław', 'Świeca', '962144420', 'Zeswiecaszukaj28@gmail.com', 1004, 'DERMATOLOGIST'),
                   (5, 105, 'Łukasz', 'Kwiat', '724144230', 'Kwiatmlodzierzy@gmail.com', 1006, 'GP');

insert into patient (date_of_birth, address_id, id, email, first_name, last_name, patient_number, telephone_number, gender)
            values (PARSEDATETIME('29.03.1989', 'dd.MM.yyyy'), 5, 01, 'arkadion99gamil@o2.pl', 'Arkadio', 'Morales', 101, 724120190, 'M'),
                   (PARSEDATETIME('31.01.1990', 'dd.MM.yyyy'), 6, 02, 'paulaantongamil@o2.pl', 'Paulucha', 'Anton', 102, 693393567, 'F'),
                   (PARSEDATETIME('21.02.1987', 'dd.MM.yyyy'), 7, 03, 'dominodomino@o2.pl', 'Dominik', 'Bieln', 103, 697803557, 'M'),
                   (PARSEDATETIME('05.05.1998', 'dd.MM.yyyy'), 8, 04, 'mateoussnba@gmail.pl', 'Mateusz', 'Stempin', 104, 889665111, 'M'),
                   (PARSEDATETIME('07.12.1996', 'dd.MM.yyyy'), 9, 05, 'jatoja@o2.pl', 'Łukasz', 'Anmateus', 105, 688883567, 'M'),
                   (PARSEDATETIME('20.11.1985', 'dd.MM.yyyy'), 10, 06, 'tytoty@o2.pl', 'Artur', 'Anton', 106, 693378590, 'M');

insert into visit (doctor_id, id, patient_id, time, description)
            values (101, 1, 01, PARSEDATETIME('18:00', 'HH:mm'), 'badanie wstępne'),
                    (102, 2, 02, PARSEDATETIME('20:00', 'HH:mm'), 'badanie ogolne'),
                    (103, 3, 03, PARSEDATETIME('11:00', 'HH:mm'), 'badanie ogolne'),
                    (104, 4, 04, PARSEDATETIME('13:00', 'HH:mm'), 'badanie ogolne'),
                    (105, 5, 05, PARSEDATETIME('14:00', 'HH:mm'), 'badanie ogolne');


insert into medical_treatment (id, visit_id, description, type)
            values (1, 1, 'cancer', 'EKG');



