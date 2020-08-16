Use BookLibrary

Create table Flights (
	AircraftCode nvarchar(10),
	FType nvarchar(10),
	Source nvarchar(20),
	Destination nvarchar(20),
	DepTime datetime,
	JourneyHrs int);

Insert into Flights values
('UA01','Boeing','Los Angeles','London','15.30',6);

Insert into Flights values
('UA02','Boeing','California','New York','09.30',8);

Insert into Flights values
('SA01','Boeing','Istanbul','Ankara','10.45',8);

Insert into Flights values
('SA02','Airbus','London','Moscow','11.15',9);

Insert into Flights values
('SQ01','Airbus','Sydney','Ankara','01.45',15);

Insert into Flights values
('SQ02','Boeing','Perth','Aden','13.30',10);

Insert into Flights values
('SQ03','Airbus','San Francisco','Nairobi','15.45',15);

Select * from Flights

Select AirCraftCode, Source, Destination, DepTime from Flights

Select top 65 percent * from Flights

Select count(AircraftCode) as FlightCount from Flights

Select *, JourneyHrs*150 from Flights
