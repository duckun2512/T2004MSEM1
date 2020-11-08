CREATE DATABASE IF NOT EXISTS ebookshop;
use ebookshop;

DROP TABLE IF EXISTS books;

CREATE TABLE books (
    id int,
    title varchar(50),
    author varchar(50),
    price float,
    qty int,
    primary key (id));

INSERT INTO books values (1001, 'Java for Dummies', 'Dang Kim Thi', 11.11,11);
INSERT INTO books values (1002, 'More Java for Dummies', 'CodeLeanVN', 22.22, 22);
INSERT INTO books values (1003, 'More Java for more Dummies', 'Mohammad Ali', 33.33, 33);
INSERT INTO books values (1004, 'A Cup for Java', 'Kumar', 44.44, 44);
INSERT INTO books values (1005, 'A Teaspoon of Java', 'Kevin Jones', 55.55, 55);

SELECT * FROM books;