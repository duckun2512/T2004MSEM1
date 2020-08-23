create database Book
go

use Book
go

create table Customer (
	CustomerID int identity(1,1) primary key,
	CustomerName varchar(50),
	Address varchar(100),
	Phone varchar(12)
)
go

create table Books (
	BookCode int primary key,
	Category varchar(50),
	Author varchar(50),
	Publisher varchar(50),
	Title varchar(100),
	Price int,
	InStore int
)
go

create table BookSold (
	BookSoldID int primary key,
	CustomerID int foreign key references Customer(CustomerID),
	BookCode int foreign key references Books(BookCode),
	Date datetime,
	Price int,
	Amount int
)
go

insert into Books values
('1','A','J.K.Rowling','Bloomsbury Publishing','H.P and the Sorcerer''s'' Stone','1000','10'),
('2','A','J.K.Rowling','Bloomsbury Publishing','H.P and The Chamber of Secrets','1000','10'),
('3','A','J.K.Rowling','Bloomsbury Publishing','H.P and the prisoner of Azkaban','1000','10'),
('4','B','Conan Doyle','Ward Lock & Co','A Study of Scarlet','1500','10'),
('5','B','Conan Doyle','George Newnes','The Adventures of Sherlock Holmes','2000','10');
go

insert into Customer values 
('Edogawa Conan','221B Baker Street','123456789'),
('Donald Trump','White House','123456788'),
('Chris Hadfield','ISS Station','123456777'),
('Warren Buffett','3555 Farnam Street','123456666'),
('Bill Gates','7400 Northeast 18th Street,Medina','123456667');
go

insert into BookSold values
('1','2','3','10-10-2020','1000','2'),
('2','2','1','12-12-2020','1000','3'),
('3','5','4','12-10-2020','1500','1'),
('4','5','5','12-10-2020','2000','1'),
('5','1','4','11-10-2020','1500','3'),
('6','1','5','11-10-2020','2000','3'),
('7','3','1','07-08-2020','1000','1'),
('8','3','2','07-08-2020','1000','1'),
('9','4','4','05-05-2019','1500','1'),
('10','4','5','05-05-2019','2000','1');
go

create view Book1
as
select b.BookCode, b.Title, bs.Price, bs.Amount*Count(BookSold.CustomerID)
as [Sold Amount]
from Books b join BookSold bs
on b.BookCode = bs.BookCode
go

create view Customer1 
as
select c.CustomerID, c.CustomerName, c.Address, bs.Amount
from Customer c join BookSold bs
on c.CustomerID = bs.CustomerID
go

create view Customer2
as
select c.CustomerID, c.CustomerName, c.Address, b.Title
from Customer c join Books b
on 
go

create view Customer3
as
select c.CustomerID, c.CustomerName, c.Address, bs.Price*bs.Amount
as [Price/Person]
from Customer c join BookSold bs
on c.CustomerID = bs.CustomerID
go