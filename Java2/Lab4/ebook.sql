create database if not exists ebookstore;

use ebookstore;

create table category(
    CatID int primary key not null,
    Name nvarchar(50)
);

create table books(
    BookID int primary key auto_increment,
    CatID int,
    Name nvarchar(100),
    Price float,
    status tinyint, /* đang bán: 1, sắp về: 2, hết hàng: 3 */
    year int,
    createdDate datetime default current_timestamp,
    updatedDate datetime default current_timestamp on update current_timestamp,
    qty int,
    constraint fk1 foreign key (CatID) references category(CatID)
);

create table customers(
    CustomerID int primary key auto_increment,
    Name nvarchar(50),
    Address nvarchar(50),
    Gender tinyint(1), # male: 1, female: 0
    DoB date,
    level tinyint(1), /* 1 vip1, 2 vip2, 3 vip3 */
    createdDate datetime default current_timestamp,
    updatedDate datetime default current_timestamp on update current_timestamp
);

create table orders(
    orderID int primary key auto_increment,
    CustomerID int,
    dateOrdered date,
    dateRequired date,
    status tinyint,
    total float,
    discount tinyint,
    constraint fk2 foreign key (CustomerID) references customers(CustomerID)
);

create table ordersDetails(
    orderID int,
    bookID int,
    price float, /* giá tại thời điểm bán */
    qty int,
    createdDate datetime default current_timestamp,
    updatedDate datetime default current_timestamp on update current_timestamp,
    constraint fk3 foreign key (orderID) references orders(orderID),
    constraint fk4 foreign key (bookID) references books(BookID)
);

drop trigger if exists books_update_qty1;
drop trigger if exists books_update_qty2;
create trigger books_update_qty1 before update on books
    for each row
    begin
        if (NEW.status = 3 or NEW.status = 2) then
            set new.qty = 0;
        end if;
    end;

create trigger books_update_qty2 before insert on books
    for each row
    begin
        if (NEW.status = 3 or NEW.status = 2) then
            set new.qty = 0;
        end if;
    end;

insert into category values (1, 'Java'),
                            (2, 'Code Developer'),
                            (3, 'Light Novel');

select * from category;

insert into books values (null, 1, 'The Humming Bird', 150000, 1, 2018, default, default, 20),
                         (null, 1, 'The Hunger Game', 100000, 1, 2008, default, default, 30),
                         (null, 1, 'The Great Gatsby', 100000, 1, 1925, default, default, 40),
                         (null, 1, 'The Tarzan', 70000, 1, 2016, default, default, 10),
                         (null, 2, 'BNWG for dummies', 80000, 3, 2014, default, default, 20),
                         (null, 2, 'Java for dummies', 110000, 1, 2019, default, default, 20),
                         (null, 2, 'Love or Hate JAVA??', 150000, 2, 2020, default, default, 20),
                         (null, 3, 'Kimi no na wa ?', 100000, 1, 2000, default, default, 20),
                         (null, 3, '5cm/s', 100000, 1, 2000, default, default, 20),
                         (null, 3, 'Arafoo Kenja No Isekai Seikatsu Nikki', 80000, 2, 2000, default, default, 20);

update books
set Price = 100000
where Name = 'Kimi no na wa ?';
select * from books;
insert into customers values (null, 'A', '100 Hang Dau', 1, '2001-4-10', 1, default, default),
                             (null, 'B', '100 Hang Muoi', 0, '2000-11-30', 3, default, default),
                             (null, 'C', '100 Hang Tre', 1, '1999-12-1', 2, default, default),
                             (null, 'D', '100 Hang Bac', 0, '2001-10-10', 1, default, default),
                             (null, 'E', '100 Hang Be', 1, '1998-10-20', 1, default, default),
                             (null, 'F', '100 Hang Ma', 0, '1991-10-15', 2, default, default);

select * from customers;
insert into orders values (null, 1, '2020-10-5', '2020-10-10', 2, 500000, 10),
                          (null, 1, '2020-10-12', '2020-10-14', 1, 300000, 10),
                          (null, 2, '2020-10-6', '2020-10-10', 1, 350000, 10),
                          (null, 3, '2020-10-7', '2020-10-10', 3, 200000, 10),
                          (null, 5, '2020-10-3', '2020-10-10', 4, 900000, 10),
                          (null, 5, '2020-10-4', '2020-10-10', 1, 800000, 10),
                          (null, 5, '2020-9-1', '2020-9-5', 5, 150000, 8),
                          (null, 6, '2020-9-12', '2020-9-13', 5, 600000, 8),
                          (null, 6, '2020-9-14', '2020-9-15', 0, 700000, 8),
                          (null, 6, '2020-9-12', '2020-9-15', 0, 800000, 8);

select * from orders;
insert into ordersDetails values (1, 1, 100000, 2, default, default),
                                 (1, 2, 100000, 1, default, default),
                                 (1, 3, 100000, 2, default, default),
                                 (2, 4, 70000, 1, default, default),
                                 (2, 5, 80000, 1, default, default),
                                 (2, 7, 150000, 1, default, default),
                                 (3, 9, 100000, 1, default, default),
                                 (3, 8, 100000, 1, default, default),
                                 (3, 4, 70000, 1, default, default),
                                 (3, 5, 80000, 1, default, default),
                                 (4, 1, 100000, 1, default, default),
                                 (4, 2, 100000, 1, default, default),
                                 (5, 1, 100000, 5, default, default),
                                 (5, 2, 100000, 4, default, default),
                                 (6, 1, 100000, 2, default, default),
                                 (6, 2, 100000, 2, default, default),
                                 (6, 3, 100000, 2, default, default),
                                 (6, 4, 70000, 2, default, default),
                                 (6, 5, 80000, 2, default, default),
                                 (7, 4, 80000, 1, default, default),
                                 (7, 5, 70000, 1, default, default),
                                 (8, 1, 60000, 10, default, default),
                                 (8, 1, 60000, 10, default, default),
                                 (10, 3, 80000, 10, default, default);
select * from ordersDetails;