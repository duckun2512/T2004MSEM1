if Exists (select * from sys.databases where Name = 'Example5')
	drop database Example5
Go
create database Example5

Go
use Example5

Go
-- Tạo bảng Lớp học
create table LopHoc (
	MaLopHoc int primary key identity,
	TenLopHoc varchar(10)
	)

Go
--Tạo bảng Sinh viên có khóa ngoại là cột MaLopHoc, nối với bảng LopHoc
create table SinhVien (
	MaSV int primary key,
	TenSV varchar(40),
	MaLopHoc int,
	constraint fk foreign key (MaLopHoc) references LopHoc (MaLopHoc)
	)

Go
--Tạo bảng SanPham với một cột NULL, một cột NOT NULL
create table SanPham (
	MaSP int NOT NULL,
	TenSP varchar(40) NULL
	)

Go
--Tạo bảng với thuộc tính default cho cột Price
create table StoreProduct (
	ProductID int NOT NULL,
	Name varchar(40) NOT NULL,
	Price money NOT NULL default(100)
	)

--Thử kiểm tra xem giá trị default có được sử dụng hay không
insert into StoreProduct (ProductID, Name) values (111, Rivets)

Go
--Tạo bảng ContactPhone với thuộc tính identity
create table ContactPhone (
	Person_ID int identity(500,1) NOT NULL,
	MobileNumber bigint NOT NULL,
	)

Go
--Tạo cột nhận dạng duy nhất tổng thể
create table CellularPhone (
	Person_ID uniqueidentifier default newid() NOT NULL,
	PersonName varchar(60) NOT NULL
	)

--Chèn một record vào
insert into CellularPhone(PersonName) values('William Smith')

Go
--Tạo bảng ContactPhone với cột MobileNumber có thuộc tính Unique
create table ContactPhone (
	Person_ID int primary key,
	MobileNumber bigint unique,
	ServiceProvider varchar(30),
	LandLineNumber bigint unique
	)

--Chèn 2 bản ghi có giá trị giống nhau ở cột MobileNumber và LandLineNumber để quan sát lỗi
insert into ContactPhone values (101,983345674,'Hutch',NULL)
insert into ContactPhone values (102,983345674,'Alex',NULL)

Go
--Tạo bảng PhoneExpenses có một CHECK ở cột Amount
create table PhoneExpenses (
	Expenses_ID int primary key,
	MobileNumber bigint foreign key references ContactPhone (MobileNumber),
	Amount bigint CHECK (Amount > 0)
	)

Go
--Chỉnh sửa cột trong bảng
alter table ContactPhone
	alter column ServiceProvider varchar(45)

Go
--Xóa cột trong bảng
alter table ContactPhone
	drop column ServiceProvider

Go
--Thêm một ràng buộc vào bảng
alter table ContactPhone add constraint CHK_RC Check (RentalCharges > 0)

Go
--Xóa một ràng buộc
alter table Person.ContactPhone
	drop constraint CHK_RC