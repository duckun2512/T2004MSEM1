CREATE DATABASE starbuck;
USE starbuck;

CREATE TABLE coffee(
                       id varchar (100) PRIMARY KEY ,
                       name varchar (100),
                       type varchar (250),
                       year char (4),
                       price float (4)
);

INSERT INTO coffee VALUE
('1001A','Asian Dolce','Frappuccino',2000,9.5),
('1001B','Espresso','Frappuccino',2001,10.5),
('1001C','Caramel ','Frappuccino',2002,11.5),
('1001D','Mocha','Frappuccino',2003,8.5),
('1001E','Java Chip','Frappuccino',2004,7.5);