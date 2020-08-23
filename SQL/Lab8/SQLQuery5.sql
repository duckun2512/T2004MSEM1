create database Lab11
go

use Lab11
go

create view ProductList
as
select ProductID, Name from AdventureWorks2016CTP3.Production.Product
go

select * from ProductList
go

create view SalesOrderDetail
as
select pr.ProductID, pr.Name, od.UnitPrice, od.OrderQty,
od.UnitPrice*od.OrderQty as [Total Price]
from AdventureWorks2016CTP3.Sales.SalesOrderDetail od
join AdventureWorks2016CTP3.Production.Product pr
on od.ProductID = pr.ProductID
go

select * from SalesOrderDetail