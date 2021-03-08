CREATE DATABASE if not EXISTS exam;
use exam;

CREATE TABLE student(
                        id int(11) AUTO_INCREMENT PRIMARY KEY,
                        name varchar(255),
                        age tinyint(4),
                        address varchar(200),
                        telephone varchar(20)
);
INSERT INTO student(name, age, address, telephone) VALUES ('11111',20,'aaaaa',0123456789),
                                                          ('22222',21,'bbbbb',0987654321);