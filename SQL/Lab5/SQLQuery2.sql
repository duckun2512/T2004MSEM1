use Example5
go

create table PhongBan (
	MaPB varchar(7) primary key,
	TenPB nvarchar(50),
)
go

create table NhanVien (
	MaNV varchar(7) primary key,
	TenNV nvarchar(50),
	NgaySinh datetime check (getdate() < current_timestamp),
	SoCMND char(9) check (SoCMND = '1,2,3,4,5,6,7,8,9,0'),
	GioiTinh char(1) check (GioiTinh = 'M,F') default('M'),
	DiaChi nvarchar(100),
	NgayVaoLam datetime,
	MaPB varchar(7) foreign key references PhongBan(MaPB)
)
go

create table LuongDA (
	MaDA varchar(8),
	MaNV varchar(7)  foreign key references NhanVien(MaNV),
	NgayNhan datetime NOT NULL default(current_timestamp),
	SoTien money check ( SoTien > 0),
	primary key(MaDA,MaNV)
)
go

insert into PhongBan (MaPB,TenPB) values
('A01','PhongA'),
('A02','PhongB'),
('A03','PhongC'),
('A04','PhongD'),
('A05','PhongE');
go

insert into NhanVien (MaNV, TenNV, NgaySinh, SoCMND, GioiTinh, DiaChi, NgayVaoLam, MaPB) values
('1','A','01-01-1990','0123456789','M','A','05-04-2010','A01'),
('2','B','02-02-1989','0123456788','F','B','10-04-2010','A02'),
('3','C','03-03-1990','0123456777','M','C','05-04-2010','A03'),
('4','D','04-04-1989','0123456666','F','D','02-02-2010','A04'),
('5','E','05-05-1990','0123455555','F','E','01-01-2010','A05');
go

insert into LuongDA (MaDA, MaNV, NgayNhan, SoTien) values
('01','1','05-05-2010','10000000'),
('02','2','10-05-2010','8000000'),
('03','3','05-05-2010','10000000'),
('04','4','02-03-2010','9000000'),
('05','5','01-02-2010','9000000');
go


select * from PhongBan, NhanVien, LuongDA
go

select * from NhanVien
where NgaySinh = 'F'
go

select MaDA from LuongDA 
go

select Count(SoTien) from LuongDA
group by MaNV
go

select TenNV from NhanVien
where MaPB like '[A]'
go

select SoTien from LuongDA
go

select p.MaPB as 'Phong Ban', count(n.MaNV) as 'So Nhan Vien'
from PhongBan p inner join NhanVien n on p.MaPB = n.MaPB
group by p.MaPB
go

select count(l.SoTien) as 'Tong Luong', n.TenNV as 'Ten Nhan Vien'
from LuongDA l inner join NhanVien n on l.MaNV = n.MaNV
where SoCMND = '%9'
group by l.SoTien
go

select n.TenNV as 'Nhan Vien', max(l.SoTien) as 'Luong cao nhat'
from NhanVien n inner join LuongDA l on n.MaNV = l.MaNV
group by n.TenNV
go

select n.TenNV as 'Nhan Vien', l.SoTien as 'Luong'
from NhanVien n inner join LuongDA l on n.MaNV = l.MaNV 
where GioiTinh = 'F' and SoTien > 1200000
group by n.TenNV
go

