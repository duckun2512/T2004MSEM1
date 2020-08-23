create database Assignment2
go

use Assignment2
go

create table Hang (
	MaHang varchar(10) primary key,
	TenHang nvarchar(20),
	DiaChi nvarchar(30),
	DienThoai int check (DienThoai like '0%')
)
go

insert into Hang values
(123,'Asus','USA','983232'),
(321,'Dell','USA','123456')
go

create table SanPham (
	MaSP varchar(10) primary key,
	tenSP nvarchar(30),
	Mota nvarchar(50),
	Gia money check (Gia > 0)
)
go

insert into SanPham values
('T1',N'M?y T?nh T450',N'M?y nh?p c?','1000'),
('T2',N'?i?n Tho?i Nokia5670',N'?i?n Tho?i ©¢ang hot','200'),
('T3',N'M?y In Samsung 450',N'M?y in ©¢ang lo?i b?nh','100')
go

create table SPtheoHang (
	MaSPTH int primary key,
	MaHang varchar(10) foreign key references Hang(MaHang),
	MaSP varchar(10) foreign key references SanPham(MaSP),
	SoLuong int check (SoLuong > 0)
)
go

insert into SPtheoHang values
(1,123,'T1',10),
(2,123,'T2',200),
(3,123,'T3',10)
go

select * from Hang
select * from SanPham
select * from SPtheoHang