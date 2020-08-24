--1
create database MyBlog
go

use MyBlog
go

--2
create table Users (
	UserID int primary key identity(1,1),
	UserName varchar(20),
	Password varchar(30),
	Email varchar(30) unique,
	Address nvarchar(200)
)
go

create table Posts (
	PostID int primary key identity(1,1),
	Title nvarchar(200),
	Content nvarchar(MAX),
	Tag nvarchar(100),
	Status bit,
	CreateTime datetime default getdate(),
	UpdateTime datetime,
	UserID int foreign key references Users(UserID)
)
go

create table Comments (
	CommentID int primary key identity(1,1),
	Content nvarchar(500),
	Status bit,
	CreateTime datetime default getdate(),
	Author nvarchar(30),
	Email varchar(50) NOT NULL,
	PostID int foreign key references Posts(PostID)
)
go

--3
alter table Users
add constraint chk_email check (Email like '%@%')
go

alter table Comments
add constraint chk_email1 check (Email like '%@%')
go

--4
create unique index IX_UserName on Users(UserName)
go

--5
insert into Users values
('aaaaaaaa','DADADADA','conandoyle@yahoo.com','221B Baker Street'),
('bbbbbbbb','BEBEBEBE','jkrow@gmail.com','111 Nguyen Trai Street'),
('cccccccc','CFCFCFCF','abc@gmail.com','123 Nguyen Trai Street')
go

insert into Posts values
('Sherlock Holmes','Sherlock Holmes is a fictional private detective created by British author Sir Arthur Conan Doyle.
Referring to himself as a "consulting detective" in the stories, 
Holmes is known for his proficiency with observation, deduction, 
forensic science, and logical reasoning that borders on the fantastic, 
which he employs when investigating cases for a wide variety of clients, including Scotland Yard.',
'article,detective',1,'2015-09-20','2018-10-22',1),

('Harry Potter','Harry Potter is a series of seven fantasy novels written by British author J. K. Rowling.
The novels chronicle the lives of a young wizard, Harry Potter, and his friends Hermione Granger and Ron Weasley,
all of whom are students at Hogwarts School of Witchcraft and Wizardry. 
The main story arc concerns Harry''s struggle against Lord Voldemort, a dark wizard who intends to become immortal, 
overthrow the wizard governing body known as the Ministry of Magic and subjugate all wizards and Muggles 
(non-magical people).','article,magic',1,'2015-11-21','2019-10-10',2),

('YouTube','YouTube is an American online video-sharing platform headquartered in San Bruno, California. 
Three former PayPal employees?Chad Hurley, Steve Chen, and Jawed Karim?created the service in February 2005.
Google bought the site in November 2006 for US$1.65 billion; YouTube now operates as one of
Google''s subsidiaries.','article,description,social',0,'2014-02-02','2016-04-04',3)
go

insert into Comments values
('Awesome book! Detective No.1!!!',1,'2016-01-01','Thank you!','conandoyle@yahoo.com',1),
('Sherlock Holmes is a God!!!',1,'2015-12-22','I know','conandoyle@gmail.com',1),
('Harry Potter is so cool..',0,'2015-12-03','And so are you','jkrow@gmail.com',2),
('YouTube is so good, I''m using it all day long!',1,'2016-04-04','Hope you will continue using','abc@gmail.com',3)
go

--6
select * from Posts
where Tag = 'Social'
go

--7
select Posts.* from Posts
inner join Users on Posts.UserID = Users.UserID
where Email = 'abc@gmail.com'
go

--8
select COUNT(CommentID) as TotalComments from Comments
go

--9
create view v_NewPost
as
select top 2 Posts.Title, Users.UserName, Posts.CreateTime
from Posts join Users on Posts.UserID = Users.UserID
go

--10
create procedure sp_GetComment 
 @PostID int
 as
select * from Comments where PostID = @PostID
go


--11
create trigger tg_UpdateTime on Posts
after insert,update as
begin
	update Posts
	set UpdateTime = getdate()
	from Posts
	join deleted on Posts.PostID = deleted.PostID
end