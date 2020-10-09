create database Toy
go

use Toy
go

create table Toys (
	ProductCode varchar(5) primary key,
	Name varchar(30),
	Category varchar(30),
	Manufacturer varchar(40),
	AgeRange varchar(15),
	UnitPrice money,
	Netweight int,
	QtyOnHand int
)
go

create procedure HeavyToys
as
select Netweight from Toys
where Netweight > 500
execute HeavyToys
go

create procedure PriceIncrease
as
select UnitPrice from Toys

begin tran
update Toys
set UnitPrice = UnitPrice + 10;

if @@ROWCOUNT = 0 
	print 'Wrong!'
else print 'Updated!'

Rollback

execute PriceIncrease
go

create procedure QtyOnHand
as
select QtyOnHand from Toys

begin tran
update Toys
set QtyOnHand = QtyOnHand - 5;

if @@ROWCOUNT = 0
	print 'Wrong!'
else print 'Updated!'

rollback

execute QtyOnHand
go

execute sp_helptext HeavyToys

execute sys.sql_modules

print object_definition(object_id('HeavyToys'))
go


	
