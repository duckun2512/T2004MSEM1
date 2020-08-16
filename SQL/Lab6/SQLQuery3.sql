create database Assignment1
go

use Assignment1
go

create table DonDH (
	MaDH int primary key,
	NguoiDH nvarchar(20) NOT NULL,
	DiaChi nvarchar(50) NOT NULL,
	DienThoai int NOT NULL,
	NgayDH datetime check (getdate() < current_timestamp)
)
go

create table DSMatHang (
	MaDH int foreign key references DonDH(MaDH),
	STT int,
	Ten nvarchar(50),
	MoTa nvarchar(50),
	Donvi nvarchar(5),
	Gia money,
	SoLuong int,
	ThanhTien money
)
go

insert into DonDH values
('123','Nguyen Van An','111 Nguyen Trai, Thanh Xuan, Ha Noi','987654321','11/18/09'),
('124','Tran Duc B','12 Nguyen Trai, Thanh Xuan, Ha Noi','123456789','12/22/09'),
('125','Nguyen Van C','122 Phuong Mai, Dong Da, Ha Noi','123789567','11/25/09');
go

insert into DSMatHang values
('123','1','May Tinh T450','May nhap moi','Chiec','1000','1','1000'),
('123','2','Dien Thoai Nokia5670','Dien thoai ©¢ang hot','Chiec','200','2','400'),
('123','3','May In Samsung 450','May in ©¢ang e','Chiec','100','1','100'),
('124','1','May Tinh T450','May nhap moi','Chiec','1000','3','3000'),
('125','1','May Tinh T450','May nhap moi','Chiec','1000','2','2000'),
('125','2','Dien thoai Nokia5670','Dien thoai ©¢ang hot','Chiec','200','1','200');
go

--------------------------------------
select NguoiDH from DonDH
go

select * from DSMatHang
go

select * from DonDH d inner join DSMatHang s
on d.MaDH = s.MaDH
go

--------------------------------------
select NguoiDH from DonDH
order by NguoiDH ASC
go

select * from DSMatHang
order by Gia DESC
go

select * from DSMatHang
where MaDH = '123'
go

--------------------------------------
select NguoiDH, count(*) from DonDH
go

select Ten, count(*) from DSMatHang
go

select STT, Ten, MoTa, Donvi, Gia, SoLuong, sum(ThanhTien) as 'Tong Tien'
from DSMatHang
group by grouping sets ( (STT, Ten, MoTa, Donvi, Gia, SoLuong), () );
go

--------------------------------------
select abs(Gia) as AbsoluteGia
from DSMatHang
go

