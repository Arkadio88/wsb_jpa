insert into address (id, address_line1, address_line2, city, postal_code)
            values (901, 'Trzmielowicka 5', 'Lokal 4', 'Wrocław', '60-400');
            insert into address (id, address_line1, address_line2, city, postal_code)
            values (1,'Kazimierza Wielkiego 45','Mieszkanie 4','Wrocław','54-500' );
            insert into address (id, address_line1, address_line2, city, postal_code)
            values (2,'Strachowicka 8','Apartament 5','Wrocław','52-812');
            insert into address (id, address_line1, address_line2, city, postal_code)
            values (3,'Duboisa 9','Mieszkania 3','Warszawa','98-404');
            insert into address (id, address_line1, address_line2, city, postal_code)
            values (4,'Puławskiego 20','Mieszkanie 7','Łódź','67-450');
            insert into address (id, address_line1, address_line2, city, postal_code)
            values (5,'Jagodowa 2','Apartament 2','Gdańsk','40-320');
            insert into address (id, address_line1, address_line2, city, postal_code)
            values (6,'Wiśniowa 40','Mieszkania 18', 'Wrocław','56-200');
            insert into address (id, address_line1, address_line2, city, postal_code)
            values (7,'Oliwkowa 32','Lokal 40','Oleśnica','54-500');
insert into doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization)
            values (1, 'Jan', 'Kowalski', '6039220123', 'Jankowalski00@gmail.com', 1, 'OCULIST');
insert into doctor (id, first_name, last_name, telephone_number, email, doctor_number, specialization)
            values (2, 'Jakub', 'Bizon', '602122923', 'Bizonowy123@gmail.com', 2, 'SURGEON');
insert into medical_treatment (id, description, type)
            values (1, 'cancer', 'EKG');

insert into visit (id, description, time)
            values (1, 'badanie wstępne', PARSEDATETIME('18:00', 'HH:mm'));

insert into patient (id, first_name, last_name, telephone_number, email, patient_number, date_of_birth)
            values (1, 'Arkadio', 'Morales', 724120190, 'arkadion99gamil@o2.pl', 3, PARSEDATETIME('29.03.1989', 'dd.MM.yyyy'));
