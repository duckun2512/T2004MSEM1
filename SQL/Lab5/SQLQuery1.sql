use AdventureWorks2016CTP3
go

select * from Person.BusinessEntityContact
where ContactTypeID >= 100 and ContactTypeID <= 200
go

select * from Person.BusinessEntityContact
where ContactTypeID between 100 and 200
go

select * from person.BusinessEntityContact
where LastName like '%e'
go

select * from Person.BusinessEntityContact
where LastName like '[RA]%e'
go

select * from Person.BusinessEntityContact
where LastName like '[RA]__e'
go

select * from Person.BusinessEntityContact.*
from Person.BusinessEntityContact inner join HumanResources.Employee on
	Person.BusinessEntityContact.ContactTypeID = HumanResources.Employee.ContactID
select Title, COUNT(*) [Title Number]
from Person.BusinessEntityContact
where Title like 'Mr%'
group by all Title
go

select Title, COUNT(*) [Title Number]
from Person.BusinessEntityContact
group by all Title
having Title like 'Mr%'
go

