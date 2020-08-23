CREATE DATABASE Assignment01
GO
USE Assignment01
GO

CREATE TABLE NguoiMua (
  Makh varchar(10) PRIMARY KEY,
  Nguoidathang nvarchar(50),
  diachi nvarchar (50),
  dienthoai CHAR(9),
  CONSTRAINT chk_dt CHECK (dienthoai not like '%[^0-9]%') 
)
Go
INSERT INTO NguoiMua VALUES 
(123, N'Nguy?n V?n An', N'111 Nguy?n Tr?i, Thanh Xu?n, H? N?i', '987654321'),
(124, N'Nguy?n V?n Anh', N'123 Nguy?n Tr?i, Thanh Xu?n, H? N?i', '123456789')
GO
CREATE TABLE SanPham (
Masp varchar(10) PRIMARY KEY,
Tensp nvarchar (30),
Mota nvarchar (50),
Giaban Money CHECK (Giaban>0)
)
Go
INSERT INTO SanPham VALUES 
('T1', N'M?y T?nh T450',N'M?y M?i Nh?p', 1000),
('T2', N'?i?n Tho?i Nokia5670', N'?i?n Tho?i ©¢ang hot', 200),
('T3', N'M?y In Samsung450',N'M?y in ©¢ang ?', 100)
GO
CREATE TABLE DonDatHang (
 Madathang int PRIMARY KEY,
 Makh varchar(10),
 Ngaydathang DATETIME,
 Soluong int CHECK (Soluong >0),
 Tongtien money
 CONSTRAINT fk_NguoiMua FOREIGN KEY (Makh) REFERENCES NguoiMua(Makh)
 )
 Go
 INSERT INTO DonDatHang VALUES (111, 123, '2011-11-11', 2, 1500)
 INSERT INTO DonDatHang VALUES (222, 124, '2011-11-11', 1, 1300)

GO
CREATE TABLE Donhangchitiet (
 Makh varchar(10),
 Madonhang int PRIMARY KEY,
 Masp varchar(10),
 Giaban Money CHECK (Giaban >0),
 Soluongmua int
 CONSTRAINT fk_SanPham FOREIGN KEY (Masp) REFERENCES SanPham(Masp),
 CONSTRAINT fk_Khanhhang FOREIGN KEY (Makh) REFERENCES NguoiMua(Makh)
 )
GO
INSERT INTO Donhangchitiet VALUES (123,11,'T1', 1000, 1)
INSERT INTO Donhangchitiet VALUES (123,12,'T2', 200, 2)
INSERT INTO Donhangchitiet VALUES (123,13,'T3', 100, 1)

SELECT * FROM NguoiMua
SELECT * FROM SanPham
SELECT * FROM DonDatHang
SELECT * FROM Donhangchitiet