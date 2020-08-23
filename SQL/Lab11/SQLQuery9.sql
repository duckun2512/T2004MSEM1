create database lab13
go

use AdventureWorks2016CTP3
go

select ProductID, Name, Color into lab13.dbo.Product
from Production.Product
go

use lab13
go

select * from Product
go

create trigger UpdateProduct
on Product
for update
as
	begin
		if(update(name))
		begin
			print 'Khong duoc phep thay doi ten san pham';
			rollback transaction;
		end
	end
go

update Product set Name = 'Cocacola' where ProductID = 1