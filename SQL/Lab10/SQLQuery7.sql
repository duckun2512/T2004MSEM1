use AdventureWorks2016CTP3
go

create procedure Display_Customers
as
select CustomerID, AccountNumber, CustomerType, rowguid, ModifiedDate
from Sales.Customer

execute Display_Customers
go

execute xp_fileexist 'c:\myTest.txt'

execute sys.sp_who

