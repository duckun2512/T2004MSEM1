create database Aptech
go

create table Classes (
	ClassName char(6),
	Teacher varchar(30),
	TimeSlot varchar(30),
	Class int,
	Lab int
)
go 

create unique clustered index MyClusteredIndex 
on Classes(ClassName) 
with (pad_index = on, fillfactor = 70, ignore_dup_key = on)
go

create index TeacherIndex on Classes(Teacher)
go

drop index TeacherIndex
go

alter index MyClusteredIndex
on Classes
set (drop_existing = on, allow_row_locks = on, allow_page_locks = on, maxdop = 2)
go

create index ClassLabIndex on Classes(Class,Lab)
go

