Use AdventureWorks2016CTP3

Select * from Person.Contact

Select title, FirstName, MiddleName, LastName, EmailAddress from Person.Contact

Select Title + '. ' + FirstName + ' ' + LastName as 'Person Name' from Person.Contact

Select * from Person.Address

Select distinct (City) from Person.Address

Select top 10 * from Person.Address

Select top 25 percent * from Person.Address

Select avg(Rate) from HumanResources.EmployeePayHistory

Select Count(EmployeeID) as TitleCount from HumanResources.Employee



Create table Student (
	StudNo int primary key,
	StudName nvarchar(50) NOT NULL,
	StudAddr nvarchar(50),
	StudPhone bigint,
	BirthDate DateTime);
Go

Insert into Student values
(1,'Michael John','New York',9145247891,'12-01-1989');

Insert into Student values
(2,'Anna Lombard','Alabama',8942574632,'08-25-1989');

Insert into Student values
(3,'Peter Dawson','California',9165688471,'02-15-1963');

Insert into Student values
(4,'Leonard Thornton','New Jersey',9142563422.'12-20-1991');

Insert into Student values
(5,'Elizabeth Isaac','Atlanta',9149855771,'07-11-1990');

Select * from Student

Alter table Student add Country nvarchar(20) NULL

Update Student set Country = 'USA'

Select * from Student



Create table Batch (
	BatchNo nvarchar(5),
	Subject nvarchar(25),
	SubjDesc nvarchar(25),
	StartDt Datetime,
	EndDt Datetime,
	Hours int);

Insert into Batch values 
('A01','Java','Database','12-01-2006','03-15-2006',96);

Insert into Batch values
('A02','Oracle','Forms','08-25-2006','11-02-2006',55);

Insert into Batch values
('A03','SQL Server 2005','Queries','05-15-2006','06-06-2006',46);

Insert into Batch values
('A04','Net','WinForms','06-20-2005','08-16-2005',48);

Insert into Batch values
('A05','JSF & Struts','CustomControls','09-07-2005','10-18-2005',120);

Select * from Batch

Select DATEDIFF(month,StartDt,EndDt) from Batch

Select BatchNo, [2005] Y2005, [2006] Y2006 from
(select YEAR(StartDt) StartYear, BatchNo, Hours from Batch)pft

Pivot
(
Sum(Hours)
for StartYear in ([2005],[2006])
)pst

Go