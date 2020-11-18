create table if not exists Student (
    StudentID char(6) primary key,
    Name varchar(50),
    Address varchar(50),
    Phone char(10) check (Phone not like '%[^0-9]%')
);