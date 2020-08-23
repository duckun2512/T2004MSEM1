create database RiverPlate
go

create table Student (
	StudentNo int primary key,
	StudentName varchar(50),
	StudentAddress varchar(100),
	PhoneNo int
)
go

create table Department (
	DeptNo int primary key,
	DeptName varchar(50),
	ManagerName char(30)
)
go

create table Assignment (
	AssignmentNo int primary key,
	Description1 varchar(100)
)
go

create table Work_Assign (
	JobID int primary key,
	StudentNo int foreign key references Student(StudentNo),
	AssignmentNo int foreign key references Assignment(AssignmentNo),
	TotalHours int,
	JobDetails XML
)
go

create unique clustered index IX_Student on Student(StudentNo)
go

alter index IX_Student on Student rebuild 
go

create nonclustered index IX_Dept on Department(DeptNo,DeptName)
go