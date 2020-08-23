use Northwind
go

create trigger checkCustomerOnInsert
on Customers
for insert
as
	begin
		if(select Phone from Customers) = NULL
		begin
			rollback transaction;
		end
	end
go

create trigger checkCustomerCountryOnUpdate
on Customers
for update
as
	begin
		if(select Country from Customers) = 'France'
		begin
			print 'Cannot change country!'
			rollback transaction;
		end
	end
go

alter table Customers
add Active int default '1'
go

create trigger checkCustomerInsteadOfDelete
on Customers
for update
as
	begin
		if(update(Active))
			update Customers
			set Active = 0
	end
go

execute sp_settriggerorder @triggername = 'checkCustomerCountryOnUpdate',
@order = 'first',
@stmttype = 'update'
go		

create trigger safety
on database
for create_table, alter_table, drop_table
as
begin
	rollback;
	print 'Not allowed.'
end
go

drop trigger checkCustomerOnInsert, checkCustomerCountryOnUpdate,
checkCustomerInsteadOfDelete, safety
go
